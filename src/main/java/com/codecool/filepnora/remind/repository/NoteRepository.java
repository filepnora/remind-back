package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
