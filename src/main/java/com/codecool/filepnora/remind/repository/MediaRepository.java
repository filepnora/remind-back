package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.media.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}
