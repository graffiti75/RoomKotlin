package br.android.cericatto.roomkotlin.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.util.Log
import br.android.cericatto.roomkotlin.database.AppDatabase
import br.android.cericatto.roomkotlin.database.Note

class MainViewModel(application: Application) : AndroidViewModel(application) {
    val notes: LiveData<List<Note>>

    init {
        val database = AppDatabase.getInstance(application)
        Log.d(TAG, "Actively retrieving the notes from the DataBase")
        notes = database.noteDao().loadAllNotes()
    }

    companion object {
        // Constant for logging.
        private val TAG = MainViewModel::class.java.simpleName
    }
}