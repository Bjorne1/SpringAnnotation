package com.annotation.config;

import com.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: Configuration声明这是一个配置类
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:17
 */
@Configuration
@ComponentScan(basePackages = "com.annotation")//指定要扫描的参数,还有exclude,include等
public class MainConfig {

    /**
     * 默认id是方法名,也可以通过value设置,类型为返回值类型
     */
    @Bean(value = "personAnnotation")
    public Person person() {
        return new Person("wcs_by_annotation", 12);
    }
}
