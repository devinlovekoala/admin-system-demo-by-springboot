package com.example.admin.pojo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {

    private Integer id;
    private String lastname;
    private String email;
    private Integer sex; //0：女，1：男
    //调用所在部门信息
    private Department department;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    public Employee(Integer id, String lastname, String email, Integer sex, Department department) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.sex = sex;
        this.department = department;
        this.birth = new Date(); //实现系统默认的创建日期
    }

}


