package com.sky.service;


import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.result.PageResult;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SetmealService {

    //新增套餐
    void saveWithDish(SetmealDTO setmealDTO);

    //分页查询
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);


    //启用或停用套餐
    void startOrStop(Integer status, Long id);


    //根据id查询菜品选项
    List<DishItemVO> getDishItemById(Long id);

    //更新套餐
    void update(SetmealDTO setmealDTO);

    //删除套餐
    void deleteBatch(List<Long> ids);

    //条件查询
    List<Setmeal> list(Setmeal setmeal);

    SetmealVO getByIdWithDish(Long id);
}
