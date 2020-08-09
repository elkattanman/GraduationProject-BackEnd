package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.RoleDTO;
import com.mufic.Final.api.v2.model.lists.RoleListDTO;
import com.mufic.Final.services.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(RoleController.BASE_URL)
public class RoleController {
    public static final String BASE_URL = "/api/v2/roles";

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public RoleListDTO getList(){
        return roleService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public RoleDTO getById(@PathVariable Long id){
        return roleService.getById(id);
    }

}
