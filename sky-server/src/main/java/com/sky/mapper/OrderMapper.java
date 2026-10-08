package com.sky.mapper;


import com.sky.dto.GoodsSalesDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.core.annotation.Order;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {


    void insert(Orders orders);

    @Select("select * from orders where number = #{orderNumber}")
    Orders getByNumber(String orderNumber);

    /**
     * 修改订单信息
     * @param orders
     */
    void update(Orders orders);


    @Select("select *from orders where status=#{pendingPayment} and order_time=#{time}")
    List<Order> getByStatusAndOrderTimeLT(Integer pendingPayment, LocalDateTime time);



    Double sumByMap(Map map);


    Integer countByMap(Map map);


    @Select("select *from orders where  id=#{id}")
    Orders getById(Long id);

    List<GoodsSalesDTO> getSalesTop(LocalDateTime begin,LocalDateTime end);
}
