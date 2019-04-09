package com.example.styletestdemo.Bean.Sign;

/**
 *  用于存放账户和密码
 */

public class PostUser {
    private String username;
    private String password;
    private String type;
    private String token;

    public PostUser(String username,String password,String type) {
        this.username = username;
        this.password =password;
        this.type = type;

    }
    public PostUser(String username,String password,String type,String token) {
        this.username = username;
        this.password =password;
        this.type = type;
        this.token = token;

    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
}
