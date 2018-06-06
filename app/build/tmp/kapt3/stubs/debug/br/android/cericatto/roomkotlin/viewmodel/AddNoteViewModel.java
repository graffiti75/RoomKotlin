package br.android.cericatto.roomkotlin.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lbr/android/cericatto/roomkotlin/viewmodel/AddNoteViewModel;", "Landroid/arch/lifecycle/ViewModel;", "database", "Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "noteId", "", "(Lbr/android/cericatto/roomkotlin/database/AppDatabase;I)V", "note", "Landroid/arch/lifecycle/LiveData;", "Lbr/android/cericatto/roomkotlin/database/Note;", "getNote", "()Landroid/arch/lifecycle/LiveData;", "app_debug"})
public final class AddNoteViewModel extends android.arch.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<br.android.cericatto.roomkotlin.database.Note> note = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<br.android.cericatto.roomkotlin.database.Note> getNote() {
        return null;
    }
    
    public AddNoteViewModel(@org.jetbrains.annotations.Nullable()
    br.android.cericatto.roomkotlin.database.AppDatabase database, int noteId) {
        super();
    }
}