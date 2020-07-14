package com.example.demo.controller;

import com.example.demo.dto.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyControllerAdvice {

/*    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map<String,String> exceptionTest(MyException ex){

        Map<String,String> map=new HashMap<>();
        map.put("code",ex.getCode());
        map.put("info",ex.getInfo());
        return map;

    }*/
@ResponseBody
@ExceptionHandler(value = ConstraintViolationException.class)
public String exceptionTest(ConstraintViolationException ex){

    System.out.println("first test");
    return "find error";

}

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public String testtest(MethodArgumentNotValidException ex){
    System.out.println("进入原始错误的捕获器");
        return "find error";
    }



    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public String exceptionTest(BindException ex){

        System.out.println("enter BindException");
        System.out.println("错误信息:"+ex.getMessage());
        //System.out.println("具体信息:");
        //ex.printStackTrace();
        return "find error";
    }

    public MyControllerAdvice() {
    System.out.println("mycontrlooeradvice construct is running");
    }

/*    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String exceptionTest(Exception ex){

        System.out.println("enter ok");
        System.out.println(ex.getMessage());
        return "find error";
    }*/
}
