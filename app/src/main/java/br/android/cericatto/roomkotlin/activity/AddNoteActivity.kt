package br.android.cericatto.roomkotlin.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import br.android.cericatto.roomkotlin.AppExecutors
import br.android.cericatto.roomkotlin.R
import br.android.cericatto.roomkotlin.database.AppDatabase
import br.android.cericatto.roomkotlin.database.Note
import br.android.cericatto.roomkotlin.viewmodel.AddNoteViewModel
import br.android.cericatto.roomkotlin.viewmodel.AddNoteViewModelFactory
import java.util.*

class AddNoteActivity : AppCompatActivity() {

    //--------------------------------------------------
    // Parameters
    //--------------------------------------------------

    // Fields for views
    private var mEditText: EditText? = null
    private var mRadioGroup: RadioGroup? = null
    private var mButton: Button? = null

    private var mNoteId = DEFAULT_NOTE_ID

    // Member variable for the Database
    private var mDb: AppDatabase? = null

    /**
     * getPriority is called whenever the selected priority needs to be retrieved
     */
    val priorityFromViews: Int
        get() {
            var priority = 1
            val checkedId = (findViewById(R.id.radioGroup) as RadioGroup).checkedRadioButtonId
            when (checkedId) {
                R.id.radButton1 -> priority = PRIORITY_HIGH
                R.id.radButton2 -> priority = PRIORITY_MEDIUM
                R.id.radButton3 -> priority = PRIORITY_LOW
            }
            return priority
        }

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)

        initViews()
        getSavedInstanceState(savedInstanceState)
        getExtras()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(INSTANCE_NOTE_ID, mNoteId)
        super.onSaveInstanceState(outState)
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    /**
     * initViews is called from onCreate to init the member variable views
     */
    private fun initViews() {
        mEditText = findViewById(R.id.editTextNoteDescription)
        mRadioGroup = findViewById(R.id.radioGroup)

        mButton = findViewById(R.id.saveButton)
        mButton?.setOnClickListener { onSaveButtonClicked() }
    }

    /**
     * populateUI would be called to populate the UI when in update mode
     *
     * @param note the note to populate the UI
     */
    private fun populateUI(note: Note?) {
        if (note == null) {
            return
        }
        mEditText?.setText(note?.description)
        setPriorityInViews(note?.priority)
    }

    private fun getSavedInstanceState(savedInstanceState: Bundle?) {
        mDb = AppDatabase.getInstance(this)
        if (savedInstanceState != null && savedInstanceState.containsKey(INSTANCE_NOTE_ID)) {
            mNoteId = savedInstanceState.getInt(INSTANCE_NOTE_ID, DEFAULT_NOTE_ID)
        }
    }

    private fun getExtras() {
        val intent = intent
        if (intent != null && intent.hasExtra(EXTRA_NOTE_ID)) {
            mButton?.setText(R.string.update_button)
            if (mNoteId == DEFAULT_NOTE_ID) {
                // populate the UI
                mNoteId = intent.getIntExtra(EXTRA_NOTE_ID, DEFAULT_NOTE_ID)

                // TODO (9) Remove the logging and the call to loadNoteById, this is done in the ViewModel now
                // TODO (10) Declare a AddNoteViewModelFactory using mDb and mNoteId
                val factory = AddNoteViewModelFactory(mDb, mNoteId)

                // TODO (11) Declare a AddNoteViewModel variable and initialize it by calling ViewModelProviders.of
                // For that use the factory created above AddNoteViewModel
                val viewModel = ViewModelProviders.of(this, factory).get(AddNoteViewModel::class.java)

                // TODO (12) Observe the LiveData object in the ViewModel. Use it also when removing the observer
                viewModel.note.observe(this, object : Observer<Note> {
                    override fun onChanged(note: Note?) {
                        viewModel.note.removeObserver(this)
                        Log.d(TAG, "Receiving database update from LiveData")
                        populateUI(note)
                    }
                })
            }
        }
    }

    /**
     * onSaveButtonClicked is called when the "save" button is clicked.
     * It retrieves user input and inserts that new note data into the underlying database.
     */
    fun onSaveButtonClicked() {
        val description = mEditText?.text.toString()
        val priority = priorityFromViews
        val date = Date()

        val note = Note(description, priority, date)
        AppExecutors.getInstance().diskIO().execute(Runnable {
            if (mNoteId == DEFAULT_NOTE_ID) {
                // Insert new note.
                mDb?.noteDao()!!.insertNote(note)
            } else {
                // Update note.
                note.id = mNoteId
                mDb?.noteDao()!!.updateNote(note)
            }
            finish()
        })
    }

    /**
     * setPriority is called when we receive a note from MainActivity
     * @param priority the priority value
     */
    fun setPriorityInViews(priority: Int) {
        when (priority) {
            PRIORITY_HIGH -> (findViewById(R.id.radioGroup) as RadioGroup).check(R.id.radButton1)
            PRIORITY_MEDIUM -> (findViewById(R.id.radioGroup) as RadioGroup).check(R.id.radButton2)
            PRIORITY_LOW -> (findViewById(R.id.radioGroup) as RadioGroup).check(R.id.radButton3)
        }
    }

    //--------------------------------------------------
    // Constants
    //--------------------------------------------------

    companion object {
        // Extra for the note ID to be received in the intent.
        val EXTRA_NOTE_ID = "extraNoteId"
        // Extra for the note ID to be received after rotation.
        val INSTANCE_NOTE_ID = "instanceNoteId"

        // Constants for priority.
        val PRIORITY_HIGH = 1
        val PRIORITY_MEDIUM = 2
        val PRIORITY_LOW = 3

        // Constant for default note id to be used when not in update mode.
        private val DEFAULT_NOTE_ID = -1

        // Constant for logging.
        private val TAG = AddNoteActivity::class.java.simpleName
    }
}