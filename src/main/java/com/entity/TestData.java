package com.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @Auther: HuangRui
 * @Date: 2021/4/9 15:33
 * @Description:
 */
@Data
public class TestData {
    private String id;
    private String name;
    private int age;
    private LocalDateTime date;

}
