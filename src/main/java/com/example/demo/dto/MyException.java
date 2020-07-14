package com.example.demo.dto;

public class MyException extends RuntimeException {
    private String code;
    private String info;

    public MyException(String code ,String info){
        this.code=code;
        this.info=info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
