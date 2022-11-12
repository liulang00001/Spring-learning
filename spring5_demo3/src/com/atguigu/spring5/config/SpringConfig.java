package com.atguigu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 21:41
 * @description:创建配置类，替代xml配置文件
 */
@Configuration //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.atguigu.spring5"})
public class SpringConfig {
}
