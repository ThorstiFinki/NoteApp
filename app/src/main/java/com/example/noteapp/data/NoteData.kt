package com.example.noteapp.data

import com.example.noteapp.model.Note

class NotesDataSource{
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "Irgendwas machen", descripton = "Na ja irgenwas machen halt"),
            Note(title = "Irgendwas machen 2", descripton = "Na ja irgenwas machen halt"),
            Note(title = "Irgendwas machen 3", descripton = "Na ja irgenwas machen halt")
        )
    }
}