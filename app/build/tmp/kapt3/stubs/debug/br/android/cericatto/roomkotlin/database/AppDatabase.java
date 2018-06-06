package br.android.cericatto.roomkotlin.database;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {br.android.cericatto.roomkotlin.database.DateConverter.class})
@android.arch.persistence.room.Database(entities = {br.android.cericatto.roomkotlin.database.Note.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "noteDao", "Lbr/android/cericatto/roomkotlin/database/NoteDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static volatile br.android.cericatto.roomkotlin.database.AppDatabase INSTANCE;
    public static final br.android.cericatto.roomkotlin.database.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.android.cericatto.roomkotlin.database.NoteDao noteDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lbr/android/cericatto/roomkotlin/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "getINSTANCE", "()Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "setINSTANCE", "(Lbr/android/cericatto/roomkotlin/database/AppDatabase;)V", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private final br.android.cericatto.roomkotlin.database.AppDatabase getINSTANCE() {
            return null;
        }
        
        private final void setINSTANCE(br.android.cericatto.roomkotlin.database.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.android.cericatto.roomkotlin.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final br.android.cericatto.roomkotlin.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}