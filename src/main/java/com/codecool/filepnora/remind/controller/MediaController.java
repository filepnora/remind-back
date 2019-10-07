package com.codecool.filepnora.remind.controller;

import com.codecool.filepnora.remind.model.media.Media;
import com.codecool.filepnora.remind.model.media.MediaType;
import com.codecool.filepnora.remind.model.media.Status;
import com.codecool.filepnora.remind.repository.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class MediaController {

    @Autowired
    private MediaRepository mediaRepository;

    @GetMapping("/users/{userId}/{mediaType}")
    private List<Media> getMediaForUserByMediaType(@PathVariable Long userId, @PathVariable String mediaType){
        return mediaRepository.getAllMediaByUserIdAndType(userId, MediaType.valueOf(mediaType));
    }

    @GetMapping("/users/{userId}/{mediaType}/{status}")
    private List<Media> getMediaForUserWislist(@PathVariable Long userId, @PathVariable String mediaType, @PathVariable String status){
        return mediaRepository.getAllMediaByUserIdAndTypeAndStatus(userId, MediaType.valueOf(mediaType), Status.valueOf(status));
    }

    //dummy
    @GetMapping("/books")
    private List<Media> getAllBooks(){
        return mediaRepository.getAllBooks();
    }

    @GetMapping("/media/{id}")
    private Media getMediaById(@PathVariable Long id){
        return mediaRepository.getById(id);
    }


}
