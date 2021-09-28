package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author arutorialo
 * @email wbl1243579058@gmail.com
 * @date 2021-09-28 21:44:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
