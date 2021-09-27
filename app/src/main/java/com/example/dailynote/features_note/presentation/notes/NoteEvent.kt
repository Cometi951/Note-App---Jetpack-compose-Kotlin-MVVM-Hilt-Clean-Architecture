package com.example.dailynote.features_note.presentation.notes

import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.presentation.util.NoteOrder

sealed class NoteEvent{
    data class Order(val noteOrder: NoteOrder) : NoteEvent()
    data class DeleteNote(val note: Note) : NoteEvent()
    object RestoreNote:NoteEvent()
    object ToggleOrderSection: NoteEvent()
}
