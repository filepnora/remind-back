package com.codecool.filepnora.remind.controller;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class MediaController {

    @Autowired
    private MediaRepository mediaRepository;

    @GetMapping("/{user-id}/media")
    private List<Media> getMediaForUser(@PathVariable Long userId){
        return mediaRepository.getAllMediaByUserId(userId);
    }

    @GetMapping("/{user-id}/media/want")
    private List<Media> getMediaForUserWislist(@PathVariable Long userId){
        return mediaRepository.getAllMediaByUserIdWithStatusWant(userId);
    }

    @GetMapping("/media/{id}")
    private Media getMediaById(@PathVariable Long id){
        return mediaRepository.getById(id);
    }


}
