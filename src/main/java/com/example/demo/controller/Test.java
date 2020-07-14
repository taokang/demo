package com.example.demo.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
@Setter
@Getter
@ToString
@Component
public class Test {

    private String age;
    private String name;

    public Test() {
        System.out.println("Test class is running");
    }
}
