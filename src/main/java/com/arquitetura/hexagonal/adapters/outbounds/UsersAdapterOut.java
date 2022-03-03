package com.arquitetura.hexagonal.adapters.outbounds;

import com.arquitetura.hexagonal.adapters.inbounds.UserEntity;
import com.arquitetura.hexagonal.application.core.domain.User;
import com.arquitetura.hexagonal.application.ports.outbounds.UserServicePortOut;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllUsersAdapterOut implements UserServicePortOut {

    private final UserRepository userRepository;

    public FindAllUsersAdapterOut(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findaAllUsers() {
        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList.stream().map(UserEntity::toUser).collect(Collectors.toList());
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = userRepository.save(new UserEntity(user));
        return userEntity.toUser();
    }
}
