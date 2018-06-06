package br.android.cericatto.roomkotlin.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

@Dao
interface NoteDao {
    @Query("SELECT * FROM note ORDER BY priority")
    fun loadAllNotes(): LiveData<List<Note>>

    @Insert
    fun insertNote(note: Note)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM note WHERE id = :id")
    fun loadNoteById(id: Int): LiveData<Note>
}
