package com.mufic.Final.api.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
public class UserDTO {

    private Long id;

    private String name;

    private String username;

    private String email;

    private String password;

    boolean enabled;

    private Date createTime;

    private Set<String> roles;

    private String type; //student or ...

    private int tid;

    @JsonProperty("user_url")
    private String userUrl;
}