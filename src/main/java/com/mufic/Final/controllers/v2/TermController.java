package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.TermDTO;
import com.mufic.Final.api.v2.model.lists.TermListDTO;
import com.mufic.Final.services.TermService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TermController.BASE_URL)
public class TermController {
    public static final String BASE_URL = "/api/v2/terms";

    private final TermService termService;

    public TermController(TermService termService) {
        this.termService = termService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TermListDTO getList(){
        return termService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public TermDTO getById(@PathVariable Long id){
        return termService.getById(id);
    }

}
