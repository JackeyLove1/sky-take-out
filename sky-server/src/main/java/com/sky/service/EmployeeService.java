package com.sky.service;

import com.sky.dto.EmployeeLoginDTO;
import com.sky.pojo.Employee;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 15727
* @description 针对表【employee(员工信息)】的数据库操作Service
* @createDate 2024-06-03 15:20:19
*/
public interface EmployeeService extends IService<Employee> {

    /**
     * 员工登录
     *
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
}
