package com.arquitetura.hexagonal.application.ports.outbounds;

import com.arquitetura.hexagonal.application.core.domain.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServicePortOut {
    List<User> findaAllUsers();

    User saveUser(User user);
}
