package com.arquitetura.hexagonal.application.ports.inbounds;

import com.arquitetura.hexagonal.application.core.domain.User;

import java.util.List;

public interface UserServicePortIn {
    List<User> findAllUsers();
}
