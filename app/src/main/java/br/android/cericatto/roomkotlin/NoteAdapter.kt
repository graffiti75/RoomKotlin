package br.android.cericatto.roomkotlin

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import br.android.cericatto.roomkotlin.database.Note
import java.text.SimpleDateFormat
import java.util.*

/**
 * This NoteAdapter creates and binds ViewHolders, that hold the description and priority of a note,
 * to a RecyclerView to efficiently display data.
 */
class NoteAdapter (private val mContext: Context, private val mItemClickListener: ItemClickListener)
    : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {

    //--------------------------------------------------
    // Constants
    //--------------------------------------------------

    // Constant for date format
    private val DATE_FORMAT = "dd/MM/yyy"

    //--------------------------------------------------
    // Parameters
    //--------------------------------------------------

    // Class variables for the List that holds note data and the Context
    /**
     * When data changes, this method updates the list of notes
     * and notifies the adapter to use the new values on it.
     */
    var notes: List<Note>? = null
        set(notes) {
            field = notes
            notifyDataSetChanged()
        }

    // Date formatter
    private val dateFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())

    //--------------------------------------------------
    // View Holder
    //--------------------------------------------------

    inner class NoteViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        var noteDescriptionView: TextView
        var updatedAtView: TextView
        var priorityView: TextView

        init {
            noteDescriptionView = itemView.findViewById(R.id.noteDescription)
            updatedAtView = itemView.findViewById(R.id.noteUpdatedAt)
            priorityView = itemView.findViewById(R.id.priorityTextView)
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View) {
            val elementId = notes!![adapterPosition].id
            mItemClickListener.onItemClickListener(elementId)
        }
    }

    //--------------------------------------------------
    // View Holder Methods
    //--------------------------------------------------

    /**
     * Called when ViewHolders are created to fill a RecyclerView.
     * @return A new NoteViewHolder that holds the view for each note
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        // Inflate the note_layout to a view
        val view = LayoutInflater.from(mContext).inflate(R.layout.note_layout, parent, false)
        return NoteViewHolder(view)
    }

    /**
     * Called by the RecyclerView to display data at a specified position in the Cursor.
     * @param holder   The ViewHolder to bind Cursor data to
     * @param position The position of the data in the Cursor
     */
    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        // Determine the values of the wanted data.
        val note = notes!![position]
        val description = note.description
        val priority = note.priority
        val updatedAt = dateFormat.format(note.updatedAt)

        // Set values.
        holder.noteDescriptionView.setText(description)
        holder.updatedAtView.text = updatedAt

        // Programmatically set the text and color for the priority TextView.
        val priorityString = "" + priority // converts int to String
        holder.priorityView.text = priorityString
        val priorityCircle = holder.priorityView.background as GradientDrawable

        // Get the appropriate background color based on the priority.
        val priorityColor = getPriorityColor(priority)
        priorityCircle.setColor(priorityColor)
    }

    //--------------------------------------------------
    // Recycler View Methods
    //--------------------------------------------------

    /**
     * Returns the number of items to display.
     */
    override fun getItemCount(): Int {
        return if (notes == null) 0
        else notes!!.size
    }

    //--------------------------------------------------
    // Methods
    //--------------------------------------------------

    /*
    Helper method for selecting the correct priority circle color.
    P1 = red, P2 = orange, P3 = yellow
    */
    private fun getPriorityColor(priority: Int): Int {
        var priorityColor = 0
        when (priority) {
            1 -> priorityColor = ContextCompat.getColor(mContext, R.color.materialRed)
            2 -> priorityColor = ContextCompat.getColor(mContext, R.color.materialOrange)
            3 -> priorityColor = ContextCompat.getColor(mContext, R.color.materialYellow)
            else -> {}
        }
        return priorityColor
    }

    //--------------------------------------------------
    // Listeners
    //--------------------------------------------------

    interface ItemClickListener {
        fun onItemClickListener(itemId: Int)
    }
}