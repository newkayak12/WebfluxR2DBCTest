package com.example.r2dbc.repository.user;

import com.example.r2dbc.repository.entity.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * Created on 2023-03-24
 * Project R2DBC
 */
public interface UserRepository  extends ReactiveCrudRepository<UserEntity, Long>, UserRepositoryCustom {
}
