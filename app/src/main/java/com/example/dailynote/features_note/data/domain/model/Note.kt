package com.example.dailynote.features_note.data.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.dailynote.ui.theme.*
import java.lang.Exception

@Entity
data class Note (
        val title: String,
        val content: String,
        val timestamp: Long,
        val color: Int,
        @PrimaryKey val id: Int? = null
){
    companion object{
        val noteColors = listOf(Red, Orange, LightBlue, LightGreen, Pink, Yellow, Brown, Gray)
    }
}

class InvalidNoteException(message: String):Exception(message)