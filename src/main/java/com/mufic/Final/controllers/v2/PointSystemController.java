package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.PointSystemDTO;
import com.mufic.Final.api.v2.model.lists.PointSystemListDTO;
import com.mufic.Final.services.PointSystemService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(PointSystemController.BASE_URL)
public class PointSystemController {
    public static final String BASE_URL = "/api/v2/pointsystems";

    private final PointSystemService pointSystemService;

    public PointSystemController(PointSystemService pointSystemService) {
        this.pointSystemService = pointSystemService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public PointSystemListDTO getList(){
        return pointSystemService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public PointSystemDTO getById(@PathVariable Long id){
        return pointSystemService.getById(id);
    }

}
