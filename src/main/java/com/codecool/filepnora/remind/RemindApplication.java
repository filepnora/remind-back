package com.codecool.filepnora.remind;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.model.media.MediaType;
import com.codecool.filepnora.remind.model.media.Status;
import com.codecool.filepnora.remind.model.note.Note;
import com.codecool.filepnora.remind.model.user.User;
import com.codecool.filepnora.remind.repository.MediaRepository;
import com.codecool.filepnora.remind.repository.NoteRepository;
import com.codecool.filepnora.remind.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@SpringBootApplication
public class RemindApplication {

    @Autowired
    UserRepository userRepository;

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    MediaRepository mediaRepository;

    public static void main(String[] args) {
        SpringApplication.run(RemindApplication.class, args);
    }

    @Bean
    @Profile("production")
    public CommandLineRunner init() {
        return args -> {

            User nori = User.builder().userName("nori").email("nori@gmail.com").password("1234")
                    .registrationDate(LocalDate.of(2019, 3, 10)).build();

            Note shopping_list = Note.builder().title("Shopping list").content("eggs, milk, chocolate (lots of), some houseplant")
                    .user(nori).dateCreated(LocalDate.of(2019, 9, 26)).build();

            Note vet_appointment = Note.builder().title("Vet").content("Not to forget: take the cat to the vet for vaccination!!!")
                    .user(nori).dateCreated(LocalDate.of(2019, 9, 27)).build();

            userRepository.save(nori);
            noteRepository.save(shopping_list);
            noteRepository.save(vet_appointment);

            Media the_great_gatsby = Media.builder().title("The Great Gatsby")
                    .releaseDate(1925).status(Status.WANT).type(MediaType.BOOK).author("F. Scott Fitzgerald").user(nori)
                    .dateAdded(LocalDate.of(2019,9,10)).build();

            Media orwell_book_1984 = Media.builder().title("1984").releaseDate(1949).author("George Orwell").user(nori)
                    .status(Status.IN_PROGRESS).type(MediaType.BOOK).dateAdded(LocalDate.of(2019,8,10)).build();

            Media monte_cristo = Media.builder().title("The Count of Monte Cristo").releaseDate(1844).user(nori)
                    .author("Alexandre Dumas").status(Status.WANT).type(MediaType.BOOK).build();

            mediaRepository.save(the_great_gatsby);
            mediaRepository.save(orwell_book_1984);
            mediaRepository.save(monte_cristo);




        };
    }

}
