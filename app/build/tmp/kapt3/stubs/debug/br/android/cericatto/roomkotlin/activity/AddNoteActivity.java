package br.android.cericatto.roomkotlin.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0012\u0010\u0016\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0006\u0010\u0017\u001a\u00020\u0011J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0014H\u0014J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2 = {"Lbr/android/cericatto/roomkotlin/activity/AddNoteActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mButton", "Landroid/widget/Button;", "mDb", "Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "mEditText", "Landroid/widget/EditText;", "mNoteId", "", "mRadioGroup", "Landroid/widget/RadioGroup;", "priorityFromViews", "getPriorityFromViews", "()I", "getExtras", "", "getSavedInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "initViews", "onCreate", "onSaveButtonClicked", "onSaveInstanceState", "outState", "populateUI", "note", "Lbr/android/cericatto/roomkotlin/database/Note;", "setPriorityInViews", "priority", "Companion", "app_debug"})
public final class AddNoteActivity extends android.support.v7.app.AppCompatActivity {
    private android.widget.EditText mEditText;
    private android.widget.RadioGroup mRadioGroup;
    private android.widget.Button mButton;
    private int mNoteId;
    private br.android.cericatto.roomkotlin.database.AppDatabase mDb;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String EXTRA_NOTE_ID = "extraNoteId";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String INSTANCE_NOTE_ID = "instanceNoteId";
    private static final int PRIORITY_HIGH = 1;
    private static final int PRIORITY_MEDIUM = 2;
    private static final int PRIORITY_LOW = 3;
    private static final int DEFAULT_NOTE_ID = -1;
    private static final java.lang.String TAG = null;
    public static final br.android.cericatto.roomkotlin.activity.AddNoteActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final int getPriorityFromViews() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    /**
     * * initViews is called from onCreate to init the member variable views
     */
    private final void initViews() {
    }
    
    /**
     * * populateUI would be called to populate the UI when in update mode
     *     *
     *     * @param note the note to populate the UI
     */
    private final void populateUI(br.android.cericatto.roomkotlin.database.Note note) {
    }
    
    private final void getSavedInstanceState(android.os.Bundle savedInstanceState) {
    }
    
    private final void getExtras() {
    }
    
    /**
     * * onSaveButtonClicked is called when the "save" button is clicked.
     *     * It retrieves user input and inserts that new note data into the underlying database.
     */
    public final void onSaveButtonClicked() {
    }
    
    /**
     * * setPriority is called when we receive a note from MainActivity
     *     * @param priority the priority value
     */
    public final void setPriorityInViews(int priority) {
    }
    
    public AddNoteActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lbr/android/cericatto/roomkotlin/activity/AddNoteActivity$Companion;", "", "()V", "DEFAULT_NOTE_ID", "", "getDEFAULT_NOTE_ID", "()I", "EXTRA_NOTE_ID", "", "getEXTRA_NOTE_ID", "()Ljava/lang/String;", "INSTANCE_NOTE_ID", "getINSTANCE_NOTE_ID", "PRIORITY_HIGH", "getPRIORITY_HIGH", "PRIORITY_LOW", "getPRIORITY_LOW", "PRIORITY_MEDIUM", "getPRIORITY_MEDIUM", "TAG", "kotlin.jvm.PlatformType", "getTAG", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEXTRA_NOTE_ID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getINSTANCE_NOTE_ID() {
            return null;
        }
        
        public final int getPRIORITY_HIGH() {
            return 0;
        }
        
        public final int getPRIORITY_MEDIUM() {
            return 0;
        }
        
        public final int getPRIORITY_LOW() {
            return 0;
        }
        
        private final int getDEFAULT_NOTE_ID() {
            return 0;
        }
        
        private final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}