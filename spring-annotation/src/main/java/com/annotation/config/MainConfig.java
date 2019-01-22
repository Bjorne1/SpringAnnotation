package com.annotation.config;

import com.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: Configuration声明这是一个配置类
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:17
 */
@Configuration
public class MainConfig {

    /**
     * 默认bean name是方法名,也可以通过value设置
     */
    @Bean(value = "personAnnotation")
    public Person person() {
        return new Person("wcs_by_annotation", 12);
    }
}
