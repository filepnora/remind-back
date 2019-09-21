package com.codecool.filepnora.remind.model.media;

import com.codecool.filepnora.remind.model.user.User;
import lombok.*;

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

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private MediaType type;

    private String link;

    private String image;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private User user;


}
