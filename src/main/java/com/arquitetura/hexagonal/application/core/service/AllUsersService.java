package com.arquitetura.hexagonal.application.core.service;

import com.arquitetura.hexagonal.adapters.inbounds.UserRequest;
import com.arquitetura.hexagonal.application.core.domain.User;
import com.arquitetura.hexagonal.application.ports.inbounds.UserServicePortIn;
import com.arquitetura.hexagonal.application.ports.outbounds.UserServicePortOut;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class FindAllUsersService implements UserServicePortIn {

    private final UserServicePortOut userServicePortOut;

    public FindAllUsersService(UserServicePortOut userServicePortOut) {
        this.userServicePortOut = userServicePortOut;
    }

    @Override
    public List<User> findAllUsers() {
        return userServicePortOut.findaAllUsers();
    }

    @Override
    public User saveUser(UserRequest userRequest) {
        User user = new User(userRequest);
        return userServicePortOut.saveUser(user);
    }
}
