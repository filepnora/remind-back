package com.codecool.filepnora.remind.model.note;

import com.codecool.filepnora.remind.model.User;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Note {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private LocalDate dateCreated;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    private User user;
}
