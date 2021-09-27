package com.example.dailynote.features_note.data.domain.usecase

import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.data.domain.repository.NoteRepository

class GetNote(
    val repository: NoteRepository
) {
    suspend operator fun invoke (id: Int): Note?{
        return repository.getNoteById(id)
    }
}