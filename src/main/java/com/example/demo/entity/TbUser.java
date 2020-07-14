package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;
import sun.plugin2.message.Message;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@TableName(value = "tb_area")
public class TbUser {
    //区域的ID
    @TableId(value = "id")
    private Long id;



    //@NotNull(message = "测试的区域的名称不能为空")
    //@NotBlank(message = "区域的名称不能为空！")
    //区域的名称
    @TableField(value = "area_name")
    private String areaNameTest;


    //@NotNull
    //区域的权重,用来做排序，值越大，越靠前
    @TableField(value = "priority")
    private Integer priority;

    @TableField(value = "age")
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAreaNameTest() {
        return areaNameTest;
    }

    public void setAreaNameTest(String areaNameTest) {
        this.areaNameTest = areaNameTest;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
