package com.example.admin.controller;

import com.example.admin.dao.DepartmentDao;
import com.example.admin.dao.EmployeeDao;
import com.example.admin.pojo.Department;
import com.example.admin.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;
    //获取全部员工信息
    @RequestMapping("/emps")
    public String list(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps", employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddPage(Model model){
        //查出所有部门的信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        //跳转到添加页面
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        //添加的操作
        System.out.println("保存的员工信息："+employee);
        employeeDao.save(employee);
        //来到员工列表页面
        //redirect:表示重定向到一个地址 /代表当前项目路径
        //forward:表示转发到一个地址
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.getEmployeeById(id);
        //查出对应用户的信息
        model.addAttribute("emp", employee);
        //查出所有部门的信息
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments", departments);
        //返回到更新用户数据页面
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmployee(Employee employee){
        System.out.println("修改的员工数据："+employee);
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/delemp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }
}
