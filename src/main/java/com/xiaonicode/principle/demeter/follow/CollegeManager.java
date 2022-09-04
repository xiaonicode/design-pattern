package com.xiaonicode.principle.demeter.follow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xiaonicode
 * @createTime: 2022/09/04 18:45
 * @description: 学院员工管理类
 */
public class CollegeManager {

    /** 获取学院的所有员工 */
    public List<CollegeEmployee> listAllCollegeEmployees() {
        List<CollegeEmployee> collegeEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工id: " + (i + 1));
            collegeEmployees.add(collegeEmployee);
        }
        return collegeEmployees;
    }

    /** 打印所有学院员工信息 */
    public void printAllCollegeEmployees() {
        List<CollegeEmployee> collegeEmployees = listAllCollegeEmployees();
        System.out.println("===============学院员工===============");
        for (CollegeEmployee collegeEmployee : collegeEmployees) {
            System.out.println(collegeEmployee.getId());
        }
    }

}
