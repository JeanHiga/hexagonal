package com.arquitetura.hexagonal.application.ports.outbounds;

import com.arquitetura.hexagonal.application.core.domain.User;

import java.util.List;

public interface UserServicePortOut {
    List<User> findaAllUsers();
}
