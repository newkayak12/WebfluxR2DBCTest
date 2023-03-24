package com.example.r2dbc.controller;

import com.example.r2dbc.repository.entity.UserEntity;
import com.example.r2dbc.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * Created on 2023-03-24
 * Project R2DBC
 */
@RestController
@RequestMapping(value = "/api/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/")
    public Mono<String> test(){
        return Mono.just("!");
    }

    @PostMapping(value = "/sign/up", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Mono<String> signUp(UserEntity user){
        return userService.signUp(user);
    }
}
