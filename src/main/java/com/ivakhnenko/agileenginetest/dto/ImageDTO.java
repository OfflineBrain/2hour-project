package com.ivakhnenko.agileenginetest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageDTO {
    private String id;

    @JsonProperty("cropped_picture")
    private String croppedPictureUrl;

    private String author;
    private String camera;
    private String tags;
    @JsonProperty("full_picture")
    private String fullPictureUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCroppedPictureUrl() {
        return croppedPictureUrl;
    }

    public void setCroppedPictureUrl(String croppedPictureUrl) {
        this.croppedPictureUrl = croppedPictureUrl;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFullPictureUrl() {
        return fullPictureUrl;
    }

    public void setFullPictureUrl(String fullPictureUrl) {
        this.fullPictureUrl = fullPictureUrl;
    }
}
