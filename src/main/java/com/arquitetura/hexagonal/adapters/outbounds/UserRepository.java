package com.arquitetura.hexagonal.adapters.outbounds;

import com.arquitetura.hexagonal.adapters.inbounds.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

}

