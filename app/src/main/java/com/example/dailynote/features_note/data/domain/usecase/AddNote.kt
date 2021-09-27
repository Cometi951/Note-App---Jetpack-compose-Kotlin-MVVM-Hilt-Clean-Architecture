package com.example.dailynote.features_note.data.domain.usecase

import com.example.dailynote.features_note.data.domain.model.InvalidNoteException
import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.data.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if (note.title.isBlank()){
            throw InvalidNoteException("The title of the note can't be Empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("The content of the note can't be Empty.")
        }
        repository.insertNote(note)
    }
}