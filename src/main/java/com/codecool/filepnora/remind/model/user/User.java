package com.codecool.filepnora.remind.model.user;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.model.note.Note;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;

    private String email;

    private String password;

    private LocalDate registrationDate;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @EqualsAndHashCode.Exclude
    @JsonIgnoreProperties({"user"})
    private List<Media> media;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @EqualsAndHashCode.Exclude
    @JsonIgnoreProperties({"user"})
    private List<Note> note;



}
