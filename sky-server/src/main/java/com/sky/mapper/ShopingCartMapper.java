package com.sky.mapper;


import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    List<ShoppingCart> list(ShoppingCart shoppingCart);

    @Update("update shopping_cart set number=#{number} where id =#{id}")
    void updateNumberById(ShoppingCart shoppingCart);


    @Insert("insert into shopping_cart ()values ()")
    void insert(ShoppingCart cart);

    @Delete("delete  from shopping_cart where user_id=#{userId}")
    void clean(Long userId);
    
}
