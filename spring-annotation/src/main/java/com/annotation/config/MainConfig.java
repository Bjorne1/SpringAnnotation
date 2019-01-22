package com.annotation.config;

import com.annotation.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @Description: Configuration声明这是一个配置类
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:17
 */
@Configuration
@ComponentScans(
        value = {
                @ComponentScan(basePackages = "com.annotation", includeFilters = {
                        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
                }, useDefaultFilters = false) //使用includeFilters时,要设置useDefaultFilters = false,其默认是true
        }
)
public class MainConfig {

    /**
     * 默认id是方法名,也可以通过value设置,类型为返回值类型
     */
    @Bean(value = "personAnnotation")
    public Person person() {
        return new Person("wcs_by_annotation", 12);
    }
}
