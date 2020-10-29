package com.ivakhnenko.agileenginetest.service;

import com.ivakhnenko.agileenginetest.dto.ImageDTO;
import com.ivakhnenko.agileenginetest.dto.ImageFeedDTO;
import com.ivakhnenko.agileenginetest.exception.ImageAppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class ImageClient {
    @Value("${photo.apiUrl}")
    private String baseUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ImageAuthService imageAuthService;


    public ImageFeedDTO getPhotoFeed(Long page) {
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);

        ResponseEntity<ImageFeedDTO> response = restTemplate.exchange(baseUrl + "/images?page=" + page, HttpMethod.GET, request, ImageFeedDTO.class);
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody();
        } else {
            throw new ImageAppException("External request failure");
        }
    }

    public ImageDTO getPhoto(String id) {
        HttpHeaders headers = getHttpHeaders();
        HttpEntity<String> request = new HttpEntity<>(headers);
        Map<String, String> params = new HashMap<>();
        params.put("id", id);
        ResponseEntity<ImageDTO> response = restTemplate.exchange(baseUrl + "/images/{id}", HttpMethod.GET, request, ImageDTO.class, params);
        if (response.getStatusCode().equals(HttpStatus.OK)) {
            return response.getBody();
        } else {
            throw new ImageAppException("External request failure");
        }
    }

    private HttpHeaders getHttpHeaders() {
        String token = imageAuthService.getToken();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Bearer " + token);
        return headers;
    }
}
