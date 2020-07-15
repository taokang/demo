package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class ExceptionTest {
    private String x1;
    private String x2;

    private final static Logger LOGGER= LoggerFactory.getLogger(ExceptionTest.class);

    public void exceptionTest  (){
        int[] k=new int[5];
        for(int i=0;i<7;i++){
            k[i]=i;
        }
        LOGGER.info("继续执行！");
        /*try {
            int[] k=new int[5];
            for(int i=0;i<7;i++){
                k[i]=i;
            }
        }catch (Exception e){
            LOGGER.info("最内层异常捕获,异常为:"+e.getStackTrace());
            throw e;
        }*/
    }
}
