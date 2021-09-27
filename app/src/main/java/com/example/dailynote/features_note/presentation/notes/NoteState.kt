package com.example.dailynote.features_note.presentation.notes

import com.example.dailynote.features_note.data.domain.model.Note
import com.example.dailynote.features_note.presentation.util.NoteOrder
import com.example.dailynote.features_note.presentation.util.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Title(orderType = OrderType.Ascending),
    val isOrderSectionVisible: Boolean = false
)
