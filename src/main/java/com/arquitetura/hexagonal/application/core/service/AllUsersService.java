package com.arquitetura.hexagonal.application.core.service;

import com.arquitetura.hexagonal.adapters.inbounds.UserRequest;
import com.arquitetura.hexagonal.application.core.domain.User;
import com.arquitetura.hexagonal.application.ports.inbounds.UserServicePortIn;
import com.arquitetura.hexagonal.application.ports.outbounds.UserServicePortOut;

import java.util.List;

public class AllUsersService implements UserServicePortIn {

    private final UserServicePortOut userServicePortOut;

    public AllUsersService(UserServicePortOut userServicePortOut) {
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
