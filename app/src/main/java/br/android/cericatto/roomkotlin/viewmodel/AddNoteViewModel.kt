package br.android.cericatto.roomkotlin.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel
import br.android.cericatto.roomkotlin.database.AppDatabase
import br.android.cericatto.roomkotlin.database.Note

class AddNoteViewModel(database: AppDatabase?, noteId: Int) : ViewModel() {
    val note: LiveData<Note> = database?.noteDao()!!.loadNoteById(noteId)
}