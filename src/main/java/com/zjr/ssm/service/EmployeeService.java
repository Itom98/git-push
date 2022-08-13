package com.zjr.ssm.service;

import com.github.pagehelper.PageInfo;
import com.zjr.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
