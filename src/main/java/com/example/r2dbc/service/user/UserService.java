package com.example.r2dbc.service.user;

import com.example.r2dbc.repository.entity.UserEntity;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<String> signUp(UserEntity user);
}
