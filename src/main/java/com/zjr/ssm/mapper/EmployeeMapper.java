package com.zjr.ssm.mapper;

import com.github.pagehelper.PageInfo;
import com.zjr.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> getAllEmployee();
}
