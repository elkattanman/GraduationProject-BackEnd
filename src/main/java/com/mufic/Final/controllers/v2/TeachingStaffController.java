package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.TeachingStaffDTO;
import com.mufic.Final.api.v2.model.lists.TeachingStaffListDTO;
import com.mufic.Final.services.TeachingStaffService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(TeachingStaffController.BASE_URL)
public class TeachingStaffController {
    public static final String BASE_URL = "/api/v2/teachingstaffs";

    private final TeachingStaffService teachingStaffService;

    public TeachingStaffController(TeachingStaffService teachingStaffService) {
        this.teachingStaffService = teachingStaffService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TeachingStaffListDTO getList(){
        return teachingStaffService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public TeachingStaffDTO getById(@PathVariable Long id){
        return teachingStaffService.getById(id);
    }

}
