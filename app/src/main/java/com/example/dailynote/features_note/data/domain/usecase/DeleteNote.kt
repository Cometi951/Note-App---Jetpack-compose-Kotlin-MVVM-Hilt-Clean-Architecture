package com.example.dailynote.features_note.data.domain.usecase

import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.data.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {
    suspend operator fun invoke(note:Note){
        repository.deleteNote(note)
    }
}