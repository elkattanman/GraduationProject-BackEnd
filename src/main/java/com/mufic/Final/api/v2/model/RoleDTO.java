package com.mufic.Final.api.v2.model;


import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    private int id;

    private String name;

    private String description;

    private List<String> privileges;

}
