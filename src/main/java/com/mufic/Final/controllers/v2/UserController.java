package com.mufic.Final.controllers.v2;

import com.mufic.Final.api.v2.model.UserDTO;
import com.mufic.Final.api.v2.model.lists.UserListDTO;
import com.mufic.Final.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(UserController.BASE_URL)
public class UserController {
    public static final String BASE_URL = "/api/v2/users";

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserListDTO getList(){
        return userService.getAll();
    }

    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getById(@PathVariable Long id){
        return userService.getById(id);
    }

}
