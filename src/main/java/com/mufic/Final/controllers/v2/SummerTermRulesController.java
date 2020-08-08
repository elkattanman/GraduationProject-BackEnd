package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.SummerTermRulesDTO;
import com.mufic.Final.api.v2.model.lists.SummerTermRulesListDTO;
import com.mufic.Final.services.SummerTermRuleService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(SummerTermRulesController.BASE_URL)
public class SummerTermRulesController {
    public static final String BASE_URL = "/api/v2/summertermrules";


    private final SummerTermRuleService summerTermRuleService;

    public SummerTermRulesController(SummerTermRuleService summerTermRuleService) {
        this.summerTermRuleService = summerTermRuleService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public SummerTermRulesListDTO getList(){
        return summerTermRuleService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public SummerTermRulesDTO getById(@PathVariable Long id){
        return summerTermRuleService.getById(id);
    }


}
