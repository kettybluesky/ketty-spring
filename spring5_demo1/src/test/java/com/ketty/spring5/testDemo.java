package com.ketty.spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDemo {

    @Test
    public void test1(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
