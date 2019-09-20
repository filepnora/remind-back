package com.codecool.filepnora.remind.model.note;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

public class Note {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private LocalDate dateCreated;
}
