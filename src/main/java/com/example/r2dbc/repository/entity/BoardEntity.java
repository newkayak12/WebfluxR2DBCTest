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
@Table(name = "tblboard")
public class BoardEntity {
    @Id
    @Column(value = "boardNo")
    private Long boardNo;
    @Column(value = "userNo")
    private Long userNo;
    @Column(value = "title")
    private String title;
    @Column(value = "contents")
    private String contents;
    @Column(value = "regDate")
    @CreatedDate
    private LocalDateTime regDate;

}
