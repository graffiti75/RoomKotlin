package br.android.cericatto.roomkotlin.database;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lbr/android/cericatto/roomkotlin/database/NoteDao;", "", "deleteNote", "", "note", "Lbr/android/cericatto/roomkotlin/database/Note;", "insertNote", "loadAllNotes", "Landroid/arch/lifecycle/LiveData;", "", "loadNoteById", "id", "", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM note ORDER BY priority")
    public abstract android.arch.lifecycle.LiveData<java.util.List<br.android.cericatto.roomkotlin.database.Note>> loadAllNotes();
    
    @android.arch.persistence.room.Insert()
    public abstract void insertNote(@org.jetbrains.annotations.NotNull()
    br.android.cericatto.roomkotlin.database.Note note);
    
    @android.arch.persistence.room.Update(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void updateNote(@org.jetbrains.annotations.NotNull()
    br.android.cericatto.roomkotlin.database.Note note);
    
    @android.arch.persistence.room.Delete()
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull()
    br.android.cericatto.roomkotlin.database.Note note);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM note WHERE id = :id")
    public abstract android.arch.lifecycle.LiveData<br.android.cericatto.roomkotlin.database.Note> loadNoteById(int id);
}