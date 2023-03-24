package com.example.r2dbc.service.user;

import com.example.r2dbc.repository.entity.UserEntity;
import com.example.r2dbc.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Objects;

/**
 * Created on 2023-03-24
 * Project R2DBC
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public Mono<String> signUp(UserEntity user) {
        return userRepository.save(user).then(Mono.just("저장에 성공했습니다."));
    }
}
