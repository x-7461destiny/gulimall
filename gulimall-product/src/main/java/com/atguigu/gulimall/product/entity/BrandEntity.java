package com.atguigu.gulimall.product.entity;

import com.atguigu.common.valid.Addgroup;
import com.atguigu.common.valid.ListValue;
import com.atguigu.common.valid.UpdateStatusGroup;
import com.atguigu.common.valid.Updategroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author arutorialo
 * @email wbl1243579058@gmail.com
 * @date 2021-09-27 19:34:19
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@NotNull(message = "修改必须指定品牌id", groups = {Updategroup.class})
	@Null(message = "新增不能指定ID",groups = {Addgroup.class})
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank(message = "品牌名必须提交",groups = {Addgroup.class})
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty(groups = {Addgroup.class})
	@URL(message = "logo必须是一个合法的url地址",groups = {Addgroup.class,Updategroup.class})
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	@NotNull(groups = {Addgroup.class,UpdateStatusGroup.class})
	@ListValue(vals = {0,1},groups = {Addgroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
	@NotEmpty(groups = {Addgroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索首字母必须是一个字母",groups = {Addgroup.class,Updategroup.class})
	private String firstLetter;
	/**
	 * 排序
	 */
	@NotNull(groups = {Addgroup.class})
	@Min(value = 0,message = "排序必须大于等于0",groups = {Addgroup.class,Updategroup.class})
	private Integer sort;

}
