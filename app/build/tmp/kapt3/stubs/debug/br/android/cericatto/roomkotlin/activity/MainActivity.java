package br.android.cericatto.roomkotlin.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lbr/android/cericatto/roomkotlin/activity/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lbr/android/cericatto/roomkotlin/NoteAdapter$ItemClickListener;", "()V", "mAdapter", "Lbr/android/cericatto/roomkotlin/NoteAdapter;", "mDb", "Lbr/android/cericatto/roomkotlin/database/AppDatabase;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "initViews", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemClickListener", "itemId", "", "setFloatingActionButton", "setItemTouch", "setupViewModel", "Companion", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements br.android.cericatto.roomkotlin.NoteAdapter.ItemClickListener {
    private android.support.v7.widget.RecyclerView mRecyclerView;
    private br.android.cericatto.roomkotlin.NoteAdapter mAdapter;
    private br.android.cericatto.roomkotlin.database.AppDatabase mDb;
    private static final java.lang.String TAG = null;
    public static final br.android.cericatto.roomkotlin.activity.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * * initViews is called from onCreate to init the member variable views
     */
    private final void initViews() {
    }
    
    private final void setFloatingActionButton() {
    }
    
    private final void setItemTouch() {
    }
    
    private final void setupViewModel() {
    }
    
    @java.lang.Override()
    public void onItemClickListener(int itemId) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lbr/android/cericatto/roomkotlin/activity/MainActivity$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}