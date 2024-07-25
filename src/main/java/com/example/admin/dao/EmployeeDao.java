package com.example.admin.dao;
import com.example.admin.pojo.Department;
import com.example.admin.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //通过Map键值对形式模拟数据库
    private static Map<Integer, Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>(); //创建一个部门表
        employees.put(101, new Employee(101, "晁", "123@qq.com", 0, new Department(101, "教学部")));
        employees.put(102, new Employee(102, "刘", "124@qq.com", 1, new Department(102, "市场部")));
        employees.put(103, new Employee(103, "赵", "125@qq.com", 0, new Department(103, "教研部")));
        employees.put(104, new Employee(104, "李", "126@qq.com", 1, new Department(104, "运营部")));
        employees.put(105, new Employee(105, "王", "127@qq.com", 0, new Department(105, "后勤部")));
    }

    //增加员工
    //主键"id"自增
    private static Integer initId = 106;
    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }
    //查询全部员工信息
    public Collection<Employee> getAll() {
        return employees.values();
    }
    //通过id查询员工
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }
    //删除员工
    public void delete(Integer id) {
        employees.remove(id);
    }
}