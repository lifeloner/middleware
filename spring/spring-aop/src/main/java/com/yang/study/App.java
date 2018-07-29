package com.yang.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yang.study.bean.Sample;
import com.yang.study.interfaces.Happy;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Happy scu = context.getBean("scu", Happy.class);
        System.out.println(scu.getClass());
        System.out.println(scu.happy());
//        Sample sample=context.getBean(Sample.class);
//        System.out.println(sample.getName());
    }
}
