package com.example.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.dao.TbUserDao;
import com.example.demo.dto.ExceptionTest;
import com.example.demo.dto.GenericTest;
import com.example.demo.dto.MyException;
import com.example.demo.entity.TbUser;
import com.example.demo.service.TbUserService;
import com.sun.javafx.scene.control.behavior.TableCellBehavior;
import com.sun.rmi.rmid.ExecPermission;
import javafx.scene.input.DataFormat;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Controller
@RequestMapping(value = "/test")
public class TbUserController {

    private static final Logger LOGGER= LoggerFactory.getLogger(TbUserController.class);
    @Autowired
    private TbUserService tbUserService;

    @Autowired
    private TbUserDao tbUserDao;

    @Autowired
    private ExceptionTest exceptionTest;

    @RequestMapping(value = "/mybatis")
    public void showTest(){
        /*TbUser tbUser=new TbUser();
        tbUser.setAreaId(5);
        tbUser.setAreaName("5555");
        tbUser.setPriority(55555);
        tbUser.setAge(2222);*/
        /*int[] a={1,2,3,4,5};
        List<TbUser> list=tbUserDao.selectByTest(a);
        for(TbUser tbUser:list){
            System.out.println("获取的值为:"+tbUser);
        }*/

    }

    @RequestMapping(value = "/hello")
    public String show(){
        return "index";
    }

/*    @ResponseBody
    @RequestMapping(value = "/insert")
    public String test(@Valid TbUser tbUser, BindingResult bindingResult) throws Exception {
        System.out.println("controller");
        if(bindingResult.hasErrors()){
            System.out.println("有错误");
            throw new Exception("获取错误");
        }
        tbUserService.insert(tbUser);
        return "test";
    }*/


    @ResponseBody
    @RequestMapping(value = "/finalTest")
    public String showshow(@Valid TbUser tbUser){
        System.out.println("finalTest!");
        return "finalTest";
    }

    @ResponseBody
    @RequestMapping(value = "/insert")
    public String test(@Valid TbUser tbUser) {
        System.out.println("enter controller");

        //TODO
        tbUserService.insert(tbUser);
        return "test";
    }

    @ResponseBody
    @RequestMapping(value = "/exception")
    public String exceptionTestVal(){
        throw new MyException("404","出现自定义异常");
        //return "OK";
    }

    @ResponseBody
    @RequestMapping("/mp")
    @Transactional
    public String showMP(){
        /*LOGGER.info("进入logger测试");
        System.out.println("enter update test");
        TbUser tbUser=tbUserDao.selectById(1);
       System.out.println("获取到的值为:"+tbUser);
       System.out.println(tbUser==null);
        LOGGER.info("获取的值为{}"+tbUser);*/

        LOGGER.info("enter mp");
        GenericTest genericTest=new GenericTest();
        genericTest.show(100);


        //LOGGER.info("是否包含:{}",x1.contains());
//        int k=10;
//        BigDecimal bigDecimal=BigDecimal.valueOf(100.502);
//        LOGGER.info("answer is :{}",bigDecimal);
//        LOGGER.info("转换后的值为:{}",bigDecimal.intValue());
//        Calendar calendar = Calendar.getInstance();
//        //DataFormat dataFormat= new DataFormat("yyyy-MM-dd HH:mm:ss");
//        //Date beforeD = beforeTime.getTime();
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.YEAR));
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.MONTH));
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.DATE));
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.HOUR));
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.MINUTE));
//        LOGGER.info("日历值为:{}",calendar.get(Calendar.SECOND));
//
//        DateFormat dateFormat=DateFormat.getDateTimeInstance();
//        LOGGER.info("格式化的日期时间为:"+dateFormat.format(calendar));

/*        LOGGER.info("java8的日期时间");
        LocalDateTime localDateTime=LocalDateTime.now().withNano(0);
        LOGGER.info("日期时间的值为:{}",localDateTime);
        LocalDateTime localDateTime1=localDateTime.plusMinutes(10);
        LOGGER.info("分钟加10后的值为:{}",localDateTime1);
        LocalDateTime localDateTime2=localDateTime.plusMinutes(-10);
        LOGGER.info("分钟减10后的值为:{}",localDateTime2);
        DateTimeFormatter formatter=DateTimeFormatter.
                ofPattern("yyyy-MM-dd:HH-mm-ss");
        LOGGER.info("格式化的值为:{}",localDateTime.format(formatter));*/




        /*Page<TbUser> page=new Page<>(1,2,false);
        QueryWrapper<TbUser> queryWrapper=new QueryWrapper<>();
        IPage<TbUser> iPage=tbUserDao.selectPage(page,queryWrapper);
        List<TbUser> list=iPage.getRecords();
        for(TbUser tbUser:list){
            System.out.println("获取的值为:"+tbUser);
        }
        SqlSession s
        SqlSessionFactoryBuilder()*/
/*        TbUser tbUser=new TbUser();
        //tbUser.setAreaId(6);
        tbUser.setAge(8888);
        tbUser.setPriority(8);
        tbUser.setAreaNameTest("888888");
        tbUserDao.insert(tbUser);*/
//        TbUser tbUser=new TbUser();
//        tbUser.setAreaId(1);
//        tbUser.setAge(121221);
/*        UpdateWrapper<TbUser> userUpdateWrapper=new UpdateWrapper<>();
        userUpdateWrapper.eq("area_id",1).set("area_name","update test");
        int k=tbUserDao.update(null,userUpdateWrapper);
        System.out.println("影响记录数:"+k);*/



/*        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
        Calendar c=Calendar.getInstance();
        System.out.println("日历:"+c);
        Date d=new Date();
        System.out.println("当前时间为："+sdf.format(d));
        c.setTime(d);
        System.out.println("C的值为:"+c);
        c.set(Calendar.DATE,c.get(Calendar.DATE)-23);
        String s=sdf.format(c.getTime());
        System.out.println("C的最终时间"+s);*/
        /*System.out.println("this is mp test");
        QueryWrapper<TbUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("age","1111").select(TbUser.class,x->!x.getColumn().equals("area_name"));
        //queryWrapper.select("area_id").eq("age","1111");
        List<TbUser> list=tbUserDao.selectList(queryWrapper);
        for(TbUser tbUser:list){
            System.out.println("获取的值为:"+tbUser);
        }*/
        /*Map<String,Object> map=new HashMap<>();
        map.put("age",1111);
        List<TbUser> list=tbUserDao.selectByMap(map);
        for(TbUser tbUser:list){
            System.out.println("输出值为:"+tbUser);
        }*/
        //TbUser tbUser=tbUserDao.selectById(5);
        //System.out.println(tbUser);
        return "mp test";
    }


}
