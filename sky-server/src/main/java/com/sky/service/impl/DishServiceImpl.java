package com.sky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.pojo.Dish;
import com.sky.service.DishService;
import com.sky.mapper.DishMapper;
import org.springframework.stereotype.Service;

/**
* @author 15727
* @description 针对表【dish(菜品)】的数据库操作Service实现
* @createDate 2024-06-03 16:58:57
*/
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish>
    implements DishService{

}




