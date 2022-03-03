package com.arquitetura.hexagonal.adapters.inbounds;

import com.arquitetura.hexagonal.application.core.domain.User;
import com.arquitetura.hexagonal.application.ports.inbounds.UserServicePortIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServicePortIn userServicePortIn;

    public UserController(UserServicePortIn userServicePortIn) {
        this.userServicePortIn = userServicePortIn;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userServicePortIn.findAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(@RequestBody UserRequest userRequest){
        return userServicePortIn.saveUser(userRequest);
    }
}
