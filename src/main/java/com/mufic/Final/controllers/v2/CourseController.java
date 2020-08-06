package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.lists.CourseListDTO;
import com.mufic.Final.services.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CourseController.BASE_URL)
public class CourseController {
    public static final String BASE_URL = "/api/v2/courses";

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping({"", "/"})
    CourseListDTO courseList(){
        return courseService.getAll();
    }
}
