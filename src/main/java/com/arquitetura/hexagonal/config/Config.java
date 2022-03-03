package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.outbounds.UsersAdapterOut;
import com.arquitetura.hexagonal.application.core.service.AllUsersService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    AllUsersService findAllUsersService(UsersAdapterOut findAllUsersAdapterOut){
        return new AllUsersService(findAllUsersAdapterOut);
    }
}
