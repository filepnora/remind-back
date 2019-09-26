package com.codecool.filepnora.remind.controller;

import com.codecool.filepnora.remind.model.note.Note;
import com.codecool.filepnora.remind.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    private List<Note> getAllNotes(){
        return noteRepository.getAllNotes();
    }

    @GetMapping("/notes/{id}")
    private Note getNoteById(@PathVariable("id") Long noteId){
        return noteRepository.getById(noteId);
    }

    @GetMapping("/user/{userId}/notes")
    private List<Note> getNotesForUser(@PathVariable("userId") Long userId) {
        return noteRepository.getNotesByUserId(userId);
    }
}
