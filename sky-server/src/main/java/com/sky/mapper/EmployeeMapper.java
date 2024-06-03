package com.sky.mapper;

import com.sky.pojo.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 15727
* @description 针对表【employee(员工信息)】的数据库操作Mapper
* @createDate 2024-06-03 15:20:19
* @Entity com.sky.pojo.Employee
*/
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    /**
     * 根据用户名查询员工
     *
     * @param username
     * @return
     */
    Employee getByUsername(String username);
}




