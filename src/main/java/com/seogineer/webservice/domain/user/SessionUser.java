package com.seogineer.webservice.domain.user;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(Users users){
        this.name = users.getName();
        this.email = users.getEmail();
        this.picture = users.getPicture();
    }
}
