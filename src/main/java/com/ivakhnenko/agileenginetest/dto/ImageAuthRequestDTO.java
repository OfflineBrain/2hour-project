package com.ivakhnenko.agileenginetest.dto;

public class ImageAuthRequestDTO {
    private String apiKey;

    public ImageAuthRequestDTO(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
