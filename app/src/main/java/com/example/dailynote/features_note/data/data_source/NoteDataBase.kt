package com.example.dailynote.features_note.data.data_source

import androidx.room.Database
import androidx.room.Entity
import androidx.room.RoomDatabase
import com.example.dailynote.features_note.data.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDataBase : RoomDatabase(){

    abstract val noteDao: NoteDao

    companion object{
        const val DATABASE_NAME = "notes_db"
    }
}