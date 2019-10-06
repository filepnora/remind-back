package com.codecool.filepnora.remind.controller;

import com.codecool.filepnora.remind.model.note.Note;
import com.codecool.filepnora.remind.model.user.User;
import com.codecool.filepnora.remind.repository.NoteRepository;
import com.codecool.filepnora.remind.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    private List<Note> getAllNotes() {
        return noteRepository.getAllNotes();
    }

    @GetMapping("/notes/{noteId}")
    private Note getNoteById(@PathVariable Long noteId) {
        return noteRepository.getById(noteId);
    }

    @GetMapping("/users/{userId}/notes")
    private List<Note> getNotesForUser(@PathVariable Long userId) {
        return noteRepository.getNotesByUserId(userId);
    }
}
