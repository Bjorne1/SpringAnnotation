package com.annotation;

import com.annotation.bean.Person;
import com.annotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:13
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 1.传统使用xml配置bean
         */
//        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        Person person = (Person) classPathXmlApplicationContext.getBean("person");
//        System.out.println(person);

        /**
         * 2.使用注解配置bean
         */
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = annotationConfigApplicationContext.getBean(Person.class);
        System.out.println(person);
        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
    }
}
