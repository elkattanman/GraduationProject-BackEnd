package com.mufic.Final.controllers.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TeachingStaffController.BASE_URL)
public class TeachingStaffController {
    public static final String BASE_URL = "/api/v2/teachingstaffs";
}
