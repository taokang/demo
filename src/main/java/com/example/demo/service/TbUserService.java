package com.example.demo.service;

import com.example.demo.dao.TbUserDao;
import com.example.demo.entity.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class TbUserService {
    @Autowired
    private TbUserDao tbUserDao;

    public void insert(TbUser tbUser){
        System.out.println("service");
        int k=tbUserDao.insert(tbUser);
        System.out.println("添加是否成功：  "+k);
    }
}
