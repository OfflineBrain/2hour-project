package com.ivakhnenko.agileenginetest.service;

import com.ivakhnenko.agileenginetest.dto.ImageAuthRequestDTO;
import com.ivakhnenko.agileenginetest.dto.ImageAuthTokenDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImageAuthService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${photo.apiKey}")
    private String apiKey;

    @Value("${photo.apiUrl}")
    private String baseUrl;

    @Value("${photo.auth}")
    private String authPath;

    public String getToken() {
        ResponseEntity<ImageAuthTokenDTO> authResponse = restTemplate.postForEntity(baseUrl + authPath, new ImageAuthRequestDTO(apiKey), ImageAuthTokenDTO.class);

        return authResponse.getBody().getToken();
    }
}
