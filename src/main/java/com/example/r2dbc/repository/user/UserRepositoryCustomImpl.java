package com.example.r2dbc.repository.user;

import com.example.r2dbc.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

/**
 * Created on 2023-03-24
 * Project R2DBC
 */
@Repository
@RequiredArgsConstructor
public class UserRepositoryCustomImpl implements UserRepositoryCustom {
    private final DatabaseClient context;
}
