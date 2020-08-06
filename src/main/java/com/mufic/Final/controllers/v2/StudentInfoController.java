package com.mufic.Final.controllers.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(StudentInfoController.BASE_URL)
public class StudentInfoController {
    public static final String BASE_URL = "/api/v2/studentinfos";
}
