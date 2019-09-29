package com.codecool.filepnora.remind.repository;

import com.codecool.filepnora.remind.model.media.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    /*@Query("SELECT m FROM Media m WHERE m.user_id = :id and m.type = :media_type")
    List<Media> getAllMediaByUserIdAndType(@Param("id") Long userId,
                                           @Param("media_type") String mediaType);

    @Query("SELECT m FROM Media m WHERE m.user_id = :id and m.type = :media_type and m.status = :status")
    List<Media> getAllMediaByUserIdAndTypeWithStatus(@Param("id") Long userId,
                                                     @Param("media_type") String mediaType,
                                                     @Param("status") String status);
*/

    Media getById(Long id);


}
