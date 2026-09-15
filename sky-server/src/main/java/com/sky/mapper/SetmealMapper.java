package com.sky.mapper;

import com.sky.entity.Setmeal;
import com.sky.vo.DishItemVO;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);


    SetmealVO getByWithDish(Long id);

    List<Setmeal>list(Setmeal setmeal);

    List<DishItemVO>getDishItemBySetmealId(Long setmealId);


    @Select(("select *from setmeal where  id=#{id}"))
    Setmeal getById(Long id);
}
