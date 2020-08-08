package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.TransactionDTO;
import com.mufic.Final.api.v2.model.lists.TransactionsListDTO;
import com.mufic.Final.services.TransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TransactionController.BASE_URL)
public class TransactionController {
    public static final String BASE_URL = "/api/v2/transactions";


    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public TransactionsListDTO getList(){
        return transactionService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public TransactionDTO getById(@PathVariable Long id){
        return transactionService.getById(id);
    }

}
