package com.codecool.filepnora.remind.model;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.model.note.Note;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String email;

    private String password;

    private LocalDate registrationDate;

    private Media media;
    private Note note;



}
