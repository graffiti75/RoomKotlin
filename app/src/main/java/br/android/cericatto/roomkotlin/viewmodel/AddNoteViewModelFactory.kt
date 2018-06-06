package br.android.cericatto.roomkotlin.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import br.android.cericatto.roomkotlin.database.AppDatabase

class AddNoteViewModelFactory(private val mDb: AppDatabase?, private val mNoteId: Int)
    : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AddNoteViewModel(mDb, mNoteId) as T
    }
}