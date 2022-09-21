package com.atguigu.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.如何使用nacos作为配置中心统一管理配置
 *      1引入依赖nacos-config
 *      2创建一个bootstrap.properties
 *      3给配置中心默认添加一个叫数据集（DataId 默认为 应用名.properties
 *      4给应用名.properties添加任何配置
 *      5动态获取配置：@RefeshScope：动态获取并刷新配置
 *                  @Value（“${配置项的key}”）获取到key的值
 *                  如果配置中心和当前应用的配置文件中都配置了相同的项，优先使用配置中心的配置
 *2.细节
 *  1：命名空间：用来做配置隔离的；
 *  默认命名空间为：public(保留空间)；默认新增的所有配置都在public空间
 *      1、开发、测试、生产。利用命名空间来做环境配置
 *      注意：在bootstrap.properties；配置上，需要使用哪个命名空间下的配置
 *          spring.cloud.nacos.config.namespace=327e6ff4-9149-4618-9f09-8cfc9b1cb11c
 *      2、每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 *
 *  2：配置集   所有的配置的集合
 *  3：配置集id 类似于文件名
 *  4：配置分组
 *
 *
 * 3同时加载多个配置集
 *      1、微服务任何配置信息1，任何1配置文件都可以放在配置中心中、
 *      2、
 *      */

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.coupon.dao")
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
