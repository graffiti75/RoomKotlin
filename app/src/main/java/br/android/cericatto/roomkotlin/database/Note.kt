package br.android.cericatto.roomkotlin.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "note")
class Note {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
    var description: String? = null
    var priority: Int = 0
    @ColumnInfo(name = "updated_at")
    var updatedAt: Date? = null

    @Ignore
    constructor(description: String, priority: Int, updatedAt: Date) {
        this.description = description
        this.priority = priority
        this.updatedAt = updatedAt
    }

    constructor(id: Int, description: String, priority: Int, updatedAt: Date) {
        this.id = id
        this.description = description
        this.priority = priority
        this.updatedAt = updatedAt
    }
}