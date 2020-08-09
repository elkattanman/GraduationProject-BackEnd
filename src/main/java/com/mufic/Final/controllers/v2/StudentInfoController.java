package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.StudentInfoDTO;
import com.mufic.Final.api.v2.model.lists.StudentInfoListDTO;
import com.mufic.Final.services.StudentInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(StudentInfoController.BASE_URL)
public class StudentInfoController {
    public static final String BASE_URL = "/api/v2/studentinfos";

    private final StudentInfoService studentInfoService;

    public StudentInfoController(StudentInfoService studentInfoService) {
        this.studentInfoService = studentInfoService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public StudentInfoListDTO getList(){
        return studentInfoService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public StudentInfoDTO getById(@PathVariable Long id){
        return studentInfoService.getById(id);
    }




}
