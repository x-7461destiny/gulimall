package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author arutorialo
 * @email wbl1243579058@gmail.com
 * @date 2021-09-28 21:13:02
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
