package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.CourseDTO;
import com.mufic.Final.api.v2.model.lists.CourseListDTO;
import com.mufic.Final.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(CourseController.BASE_URL)
public class CourseController {
    public static final String BASE_URL = "/api/v2/courses";

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CourseListDTO getList(){
        return courseService.getAll();
    }

    @GetMapping({"/{code}"})
    @ResponseStatus(HttpStatus.OK)
    public CourseDTO getByCode(@PathVariable String code){
        return courseService.getById(code);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CourseDTO createNewVendor(@RequestBody CourseDTO courseDTO){
        return courseService.createNew(courseDTO);
    }

}
