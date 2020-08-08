package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.ProgramDTO;
import com.mufic.Final.api.v2.model.lists.ProgramListDTO;
import com.mufic.Final.services.ProgramService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ProgramController.BASE_URL)
public class ProgramController {
    public static final String BASE_URL = "/api/v2/programs";

    private final ProgramService programService;

    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ProgramListDTO getList(){
        return programService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public ProgramDTO getById(@PathVariable Long id){
        return programService.getById(id);
    }

}
