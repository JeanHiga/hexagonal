package com.arquitetura.hexagonal.application.ports.inbounds;

import com.arquitetura.hexagonal.adapters.inbounds.UserRequest;
import com.arquitetura.hexagonal.application.core.domain.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServicePortIn {
    List<User> findAllUsers();

    User saveUser(UserRequest userRequest);
}

