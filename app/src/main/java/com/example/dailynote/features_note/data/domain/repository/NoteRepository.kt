package com.example.dailynote.features_note.data.domain.repository

import com.example.dailynote.features_note.data.domain.model.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getNote(): Flow<List<Note>>

    suspend fun getNoteById(id: Int): Note?

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}