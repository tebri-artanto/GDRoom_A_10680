package com.example.gdroom_a_10680.room

import androidx.room.PrimaryKey

data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
    )