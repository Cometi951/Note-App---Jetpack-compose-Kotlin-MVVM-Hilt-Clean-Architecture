package com.example.dailynote.features_note.data.domain.usecase

import androidx.navigation.NavDestination

data class NoteUsecases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
