package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用Nacos作为中心配置统一管理配置
 * 	1）.引入依赖
 * 		 <dependency>
 *      	<groupId>com.alibaba.cloud</groupId>
 *      	<artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *  	</dependency>
 *  2）.创建bootstrap.propeties 并配置（记得启动nacos服务器)
 *  3). 需要给配置中心添加一个数据集（DataId)
 *  5).动态获取配置
 *       @RefreshScope
 * 		 @Value
 * 	2.细节
 * 	  1）.命名空间：配置隔离
 *			默认：public（保留空间）
 *			1.开发，测试，生产：利用命名空间来做环境隔离
 *				需要在bootstrap.properties配置使用哪个空间下的配置
 *			2.每个微服务之间互相隔离，都创建自己的命名空间，只加载自己空间的配置（基本差不多与前面）
 *
 * 	  2）.配置集（所有配置的集合）
 * 	  3）.配置集ID：类似于文件名  DataId
 * 	  4).分组：默认所有的配置集都属于：DEFAULT_GROUP;要修改在bootstrap.properties的config.group里面
 * 	每个微服务创建自己的命名空间，使用p配置分组区分环境dev，test，prop
 *	微服务任何配置信息都可以放在配置中心中，只需要在bootstrap.properties中说明哪些配置文件即可
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallCouponApplication.class, args);
	}

}
