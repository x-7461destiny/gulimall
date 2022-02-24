package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1。整合Mybatis-Plus
 * 		1).导入依赖
 * 	        <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2).配置
 *      	1.配置数据源
 *      		1).导入数据库驱动
 *      		2).在application.yml配置数据源相关信息
 *      	2.配置Mybatis-Plus
 *      		1).使用@MapperScan
 *      		2).告诉Mybatis-Plus,sql映射文件位置
 *  2、逻辑删除
 *
 *  3.jSR303
 *    1). 给Bean添加校验注解: javax.validation.constraints(需要导入依赖），并定义自己的message提示
 *    2).开启校验功能 @valid
 *    		效果:校验错误会有默认的响应
 *    3). 给校验的bean后面紧跟BindResult，就可以获取校验的结果
 *    4). 分组校验
 *    	1).给注解标注什么情况需要进行校验
 *                @NotBlank(message = "品牌名必须提交",groups = {Updategroup.class,Updategroup.class})
 *      2）. @Validated({Addgroup.class})
 *      3). 默认没有指定分组的校验注解，在分组不生效，只会在@Validated生效
 *     5).自定义校验
 *     		1).编写一个自定义校验注解
 *     		2).编写一个自定义校验器
 *     		3).关联自定义校验器和自定义的校验器
 * 4 统一异常处理
 * @ControllerAdvice
 * 	1).
 */


@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallProductApplication.class, args);
	}

}
