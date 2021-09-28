package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author arutorialo
 * @email wbl1243579058@gmail.com
 * @date 2021-09-28 20:57:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
