package br.android.cericatto.roomkotlin;

import java.lang.System;

/**
 * * This NoteAdapter creates and binds ViewHolders, that hold the description and priority of a note,
 * * to a RecyclerView to efficiently display data.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lbr/android/cericatto/roomkotlin/NoteAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lbr/android/cericatto/roomkotlin/NoteAdapter$NoteViewHolder;", "mContext", "Landroid/content/Context;", "mItemClickListener", "Lbr/android/cericatto/roomkotlin/NoteAdapter$ItemClickListener;", "(Landroid/content/Context;Lbr/android/cericatto/roomkotlin/NoteAdapter$ItemClickListener;)V", "DATE_FORMAT", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "notes", "", "Lbr/android/cericatto/roomkotlin/database/Note;", "getNotes", "()Ljava/util/List;", "setNotes", "(Ljava/util/List;)V", "getItemCount", "", "getPriorityColor", "priority", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClickListener", "NoteViewHolder", "app_debug"})
public final class NoteAdapter extends android.support.v7.widget.RecyclerView.Adapter<br.android.cericatto.roomkotlin.NoteAdapter.NoteViewHolder> {
    private final java.lang.String DATE_FORMAT = "dd/MM/yyy";
    
    /**
     * * When data changes, this method updates the list of notes
     *     * and notifies the adapter to use the new values on it.
     */
    @org.jetbrains.annotations.Nullable()
    private java.util.List<br.android.cericatto.roomkotlin.database.Note> notes;
    private final java.text.SimpleDateFormat dateFormat = null;
    private final android.content.Context mContext = null;
    private final br.android.cericatto.roomkotlin.NoteAdapter.ItemClickListener mItemClickListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<br.android.cericatto.roomkotlin.database.Note> getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.Nullable()
    java.util.List<br.android.cericatto.roomkotlin.database.Note> notes) {
    }
    
    /**
     * * Called when ViewHolders are created to fill a RecyclerView.
     *     * @return A new NoteViewHolder that holds the view for each note
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.android.cericatto.roomkotlin.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * * Called by the RecyclerView to display data at a specified position in the Cursor.
     *     * @param holder   The ViewHolder to bind Cursor data to
     *     * @param position The position of the data in the Cursor
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    br.android.cericatto.roomkotlin.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    /**
     * * Returns the number of items to display.
     */
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    private final int getPriorityColor(int priority) {
        return 0;
    }
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    br.android.cericatto.roomkotlin.NoteAdapter.ItemClickListener mItemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lbr/android/cericatto/roomkotlin/NoteAdapter$NoteViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lbr/android/cericatto/roomkotlin/NoteAdapter;Landroid/view/View;)V", "noteDescriptionView", "Landroid/widget/TextView;", "getNoteDescriptionView", "()Landroid/widget/TextView;", "setNoteDescriptionView", "(Landroid/widget/TextView;)V", "priorityView", "getPriorityView", "setPriorityView", "updatedAtView", "getUpdatedAtView", "setUpdatedAtView", "onClick", "", "view", "app_debug"})
    public final class NoteViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView noteDescriptionView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView updatedAtView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView priorityView;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getNoteDescriptionView() {
            return null;
        }
        
        public final void setNoteDescriptionView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getUpdatedAtView() {
            return null;
        }
        
        public final void setUpdatedAtView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPriorityView() {
            return null;
        }
        
        public final void setPriorityView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbr/android/cericatto/roomkotlin/NoteAdapter$ItemClickListener;", "", "onItemClickListener", "", "itemId", "", "app_debug"})
    public static abstract interface ItemClickListener {
        
        public abstract void onItemClickListener(int itemId);
    }
}