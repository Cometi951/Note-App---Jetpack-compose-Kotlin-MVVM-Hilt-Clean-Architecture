package com.example.dailynote.features_note.data.repository

import androidx.compose.animation.core.rememberInfiniteTransition
import com.example.dailynote.features_note.data.data_source.NoteDao
import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.data.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    val dao: NoteDao
) : NoteRepository {
    override fun getNote(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }

}