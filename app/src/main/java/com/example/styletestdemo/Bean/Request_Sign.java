package com.example.styletestdemo.Bean;

public class Request_Sign {
    private String token;
    public Request_Sign(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
