package com.annotation.config;

import com.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//类中组件统一设置。满足当前条件，这个类中配置的所有bean注册才能生效；
@Configuration
//@Import导入组件，id默认是组件的全类名
public class MainConfig2 {

    //默认是单实例的

    /**
     * ConfigurableBeanFactory#SCOPE_PROTOTYPE
     *
     * @Scope:调整作用域 prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。
     * 每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。
     * 以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     */
    @Scope("prototype")
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加Person....");
        return new Person("张三", 25);
    }

}