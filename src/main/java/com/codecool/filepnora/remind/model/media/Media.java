package com.codecool.filepnora.remind.model.media;

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
public class Media {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private LocalDate releaseDate;

    private LocalDate dateAdded;

    private LocalDate dateCompleted;

    private Status status;

    private MediaType type;

    private String link;

    private String image;


}
