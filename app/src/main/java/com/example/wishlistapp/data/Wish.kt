package com.example.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo("wish-title")
    val title: String,
    @ColumnInfo("wish-desc")
    val description: String
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Android Developer Job", description = "I wanted to get a job as an Android Developer for MBKM"),
        Wish(title = "Android Developer Job", description = "I wanted to get a job as an Android Developer for MBKM"),
        Wish(title = "Android Developer Job", description = "I wanted to get a job as an Android Developer for MBKM"),
        Wish(title = "Android Developer Job", description = "I wanted to get a job as an Android Developer for MBKM"),
        Wish(title = "Android Developer Job", description = "I wanted to get a job as an Android Developer for MBKM"),

    )
}