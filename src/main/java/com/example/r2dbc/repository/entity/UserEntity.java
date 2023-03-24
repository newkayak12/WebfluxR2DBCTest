package com.example.r2dbc.repository.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

/**
 * Created on 2023-03-24
 * Project R2DBC
 */
@Data
@EqualsAndHashCode(of = "boardNo")
@ToString
@Table(name = "tbluser")
public class UserEntity {
    @Id
    @Column(value = "userNo")
    private Long userNo;
    @Column(value = "userId")
    private String userId;
    @Column(value = "userPwd")
    private String userPwd;
    @Column(value = "lastLoginDate")
    @CreatedDate
    private LocalDateTime lastLoginDate;



}
