package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public class TestPostConstruct {
    @Autowired
    private Test test;

    public TestPostConstruct() {
        System.out.println("postconstruct construct is running");
    }

    @PostConstruct
    public void show(){
        System.out.println("postconstruct is running");
    }
}
