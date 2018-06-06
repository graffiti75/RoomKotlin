package br.android.cericatto.roomkotlin.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log
import br.android.cericatto.roomkotlin.AppExecutors
import br.android.cericatto.roomkotlin.NoteAdapter
import br.android.cericatto.roomkotlin.R
import br.android.cericatto.roomkotlin.database.AppDatabase
import br.android.cericatto.roomkotlin.database.Note
import br.android.cericatto.roomkotlin.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NoteAdapter.ItemClickListener {

    //--------------------------------------------------
    // Parameters
    //--------------------------------------------------

    // Member variables for the adapter and RecyclerView
    private var mRecyclerView: RecyclerView? = null
    private var mAdapter: NoteAdapter? = null

    private var mDb: AppDatabase? = null

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        setItemTouch()
        setFloatingActionButton()
        setupViewModel()
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    /**
     * initViews is called from onCreate to init the member variable views
     */
    private fun initViews() {
        // Set the layout for the RecyclerView to be a linear layout, which measures and
        // positions items within a RecyclerView into a linear list.
        recyclerViewNotes.setLayoutManager(LinearLayoutManager(this))

        val decoration = DividerItemDecoration(applicationContext, DividerItemDecoration.VERTICAL)
        recyclerViewNotes.addItemDecoration(decoration)

        // Initialize the adapter and attach it to the RecyclerView.
        mAdapter = NoteAdapter(this, this)
        recyclerViewNotes.setAdapter(mAdapter)
    }

    private fun setFloatingActionButton() {
        /*
         Set the Floating Action Button (FAB) to its corresponding View.
         Attach an OnClickListener to it, so that when it's clicked, a new intent will be created
         to launch the AddNoteActivity. */
        floatingActionButton.setOnClickListener {
            // Create a new intent to start an AddNoteActivity
            val addNoteIntent = Intent(this@MainActivity, AddNoteActivity::class.java)
            startActivity(addNoteIntent)
        }
    }

    private fun setItemTouch() {
        /*
         Add a touch helper to the RecyclerView to recognize when a user swipes to delete an item.
         An ItemTouchHelper enables touch behavior (like swipe and move) on each ViewHolder,
         and uses callbacks to signal when a user is performing these actions.
         */
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT) {
            override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder): Boolean {
                return false
            }

            // Called when a user swipes left or right on a ViewHolder
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
                // Here is where you'll implement swipe to delete
                AppExecutors.getInstance().diskIO().execute {
                    val position = viewHolder.adapterPosition
                    val notes = mAdapter!!.notes
                    mDb?.noteDao()?.deleteNote(notes!!.get(position))
                }
            }
        }).attachToRecyclerView(recyclerViewNotes)
    }


    private fun setupViewModel() {
        mDb = AppDatabase.getInstance(this)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.notes.observe(this, object : Observer<List<Note>> {
            override fun onChanged(notes: List<Note>?) {
                Log.d(TAG, "Updating list of notes from LiveData in ViewModel")
                mAdapter!!.notes = notes
            }
        })
    }

    //--------------------------------------------------
    // Listener
    //--------------------------------------------------

    override fun onItemClickListener(itemId: Int) {
        // Launch AddNoteActivity adding the itemId as an extra in the intent
        val intent = Intent(this@MainActivity, AddNoteActivity::class.java)
        intent.putExtra(AddNoteActivity.EXTRA_NOTE_ID, itemId)
        startActivity(intent)
    }

    //--------------------------------------------------
    // Constants
    //--------------------------------------------------

    companion object {
        // Constant for logging
        private val TAG = MainActivity::class.java.simpleName
    }
}