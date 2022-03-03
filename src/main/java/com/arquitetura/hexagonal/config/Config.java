package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.outbounds.FindAllUsersAdapterOut;
import com.arquitetura.hexagonal.application.core.service.FindAllUsersService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    FindAllUsersService findAllUsersService(FindAllUsersAdapterOut findAllUsersAdapterOut){
        return new FindAllUsersService(findAllUsersAdapterOut);
    }
}
