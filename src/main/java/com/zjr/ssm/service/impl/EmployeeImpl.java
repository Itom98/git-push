package com.zjr.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjr.ssm.mapper.EmployeeMapper;
import com.zjr.ssm.pojo.Employee;
import com.zjr.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,5);
        //查询所有员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页相关数据
        PageInfo<Employee> page = new PageInfo<Employee>(list, 4);
        return page;
    }
}
