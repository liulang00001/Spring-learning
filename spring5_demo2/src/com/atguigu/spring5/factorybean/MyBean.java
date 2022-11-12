package com.atguigu.spring5.factorybean;

import com.atguigu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/21 00:09
 * @description:
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    // 定义返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("Java一百天");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
