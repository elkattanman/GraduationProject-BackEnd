package com.mufic.Final.controllers.v2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(TermController.BASE_URL)
public class TermController {
    public static final String BASE_URL = "/api/v2/terms";
}