package com.xiaonicode.principle.demeter.follow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:49
 * @description: 学校的管理类 <br/>
 * 直接朋友 (成员变量, 方法参数, 方法返回值类型): Employee, CollegeManager
 */
public class SchoolManager {

    /** 获取学校总部的所有员工 */
    public List<Employee> listAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id: " + (i + 1));
            employees.add(employee);
        }
        return employees;
    }

    /** 打印学校总部和学院一员工信息 */
    public void printAllEmployees(CollegeManager sub) {
        sub.printAllCollegeEmployees();

        List<Employee> employees = listAllEmployees();
        System.out.println("============学校总部员工============");
        for (Employee employee : employees) {
            System.out.println(employee.getId());
        }
    }

}
