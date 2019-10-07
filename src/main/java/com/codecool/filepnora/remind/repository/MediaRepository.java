package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.model.media.MediaType;
import com.codecool.filepnora.remind.model.media.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    @Query("SELECT m FROM Media m WHERE m.user.id = :id and m.type = :media_type")
    List<Media> getAllMediaByUserIdAndType(@Param("id") Long userId,
                                           @Param("media_type") MediaType mediaType);

    @Query("SELECT m FROM Media m WHERE m.user.id = :id and m.type = :media_type and m.status = :status")
    List<Media> getAllMediaByUserIdAndTypeAndStatus(@Param("id") Long userId,
                                                     @Param("media_type") MediaType mediaType,
                                                     @Param("status") Status status);

    Media getById(Long id);

    @Query("SELECT m FROM Media m WHERE type = 'BOOK'")
    List<Media> getAllBooks();
}
