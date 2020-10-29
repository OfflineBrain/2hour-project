package com.ivakhnenko.agileenginetest.api.v1;

import com.ivakhnenko.agileenginetest.dto.ImageDTO;
import com.ivakhnenko.agileenginetest.dto.ImageFeedDTO;
import com.ivakhnenko.agileenginetest.service.ImageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ImageApi {

    @Autowired
    private ImageClient imageClient;

    @GetMapping("/image/feed")
    public ResponseEntity<ImageFeedDTO> getPhotoFeed(@RequestParam(required = false, defaultValue = "1") Long page) {
        return new ResponseEntity<>(imageClient.getPhotoFeed(page), HttpStatus.OK);
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<ImageDTO> getPhoto(@PathVariable String id) {
        return new ResponseEntity<>(imageClient.getPhoto(id), HttpStatus.OK);
    }
}
