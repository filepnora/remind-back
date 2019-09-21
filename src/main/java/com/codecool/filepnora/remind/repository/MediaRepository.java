package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.media.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    @Query("SELECT m FROM media m WHERE user_id = :id")
    List<Media> getAllMediaByUserId(@Param("id") Long userId);

    @Query("SELECT m FROM media m WHERE user_id = :id and status = 'WANT'")
    List<Media> getAllMediaByUserIdWithStatusWant(Long userId);

    Media getById(Long id);


}
