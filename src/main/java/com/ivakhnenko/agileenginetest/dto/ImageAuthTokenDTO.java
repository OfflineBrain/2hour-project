package com.ivakhnenko.agileenginetest.dto;

public class ImageAuthTokenDTO {
    private String token;
    private boolean auth;

    public ImageAuthTokenDTO() {
    }

    public ImageAuthTokenDTO(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isAuth() {
        return auth;
    }

    public void setAuth(boolean auth) {
        this.auth = auth;
    }
}
