package com.mufic.Final.controllers.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ProgramController.BASE_URL)
public class ProgramController {
    public static final String BASE_URL = "/api/v2/programs";
}
