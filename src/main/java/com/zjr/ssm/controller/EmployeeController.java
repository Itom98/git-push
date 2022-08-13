package com.zjr.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.zjr.ssm.pojo.Employee;
import com.zjr.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(Model model,@PathVariable("pageNum") Integer pageNum){
        //获取员工的分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        System.out.println(page.getList());
        model.addAttribute("page",page);
        return "emp_list";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployees(Model model){
        List<Employee> employees = employeeService.getAllEmployees();
        //System.out.println(employees);
        model.addAttribute("list",employees);

        return "emp_list";
    }

}
