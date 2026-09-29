package com.sky.mapper;


import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import com.sky.vo.DishItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {


    List<Long> getSetmealIdsByDishIds(List<Long> DishIds);

    List<Setmeal> list(Setmeal setmeal);

    getDishItemBySetmealId(Long id);

    void insertBatch(List<SetmealDish> setmealDishes);
}
