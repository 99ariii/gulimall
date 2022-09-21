package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 1.导入mybatis-plus依赖
 * 2.配置
 *  1.配置数据源
 *      1.导入数据库驱动
 *      2.在application.yml配置数据源相关信息
 *  2.配置mybatis-plus；
 *      1.使用mapperscan
 *      2.告诉mybatis-plus sql映射文件在哪里
 * */
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
