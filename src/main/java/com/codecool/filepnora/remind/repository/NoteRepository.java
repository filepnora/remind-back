package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.note.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query("SELECT n FROM Note n")
    List<Note> getAllNotes();

    Note getById(Long id);

    @Query("SELECT n FROM Note n where user_id = : id")
    List<Note> getNotesByUserId(Long userId);


}
