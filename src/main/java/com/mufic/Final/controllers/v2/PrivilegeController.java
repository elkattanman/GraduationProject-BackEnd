package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.PrivilegeDTO;
import com.mufic.Final.api.v2.model.lists.PrivilegeListDTO;
import com.mufic.Final.services.PrivilegeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(PrivilegeController.BASE_URL)
public class PrivilegeController {
    public static final String BASE_URL = "/api/v2/privilege";

    private final PrivilegeService privilegeService;

    public PrivilegeController(PrivilegeService privilegeService) {
        this.privilegeService = privilegeService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PrivilegeListDTO getList(){
        return privilegeService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public PrivilegeDTO getById(@PathVariable Long id){
        return privilegeService.getById(id);
    }

}
