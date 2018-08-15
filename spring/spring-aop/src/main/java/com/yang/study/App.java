package com.yang.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.yang.study.bean.AopBean;
import com.yang.study.bean.Scu;
import com.yang.study.service.SampleService;
import com.yang.study.service.UserService;

public class App {

    public static void aopTest(ApplicationContext context) {
        Scu scu = context.getBean("scu", Scu.class);
        System.out.println(scu.getClass());
        System.out.println(scu.happy());
        System.out.println(scu.getRank());
    }

    public static void testAopBeanRefer(ApplicationContext context) {
        AopBean aopBean = context.getBean(AopBean.class);
        System.out.println(aopBean.getScu().getRank());
    }

    public  static  void testMysql(ApplicationContext context){
        SampleService sampleService= context.getBean(SampleService.class);
        UserService userService=context.getBean(UserService.class);
        System.out.println(sampleService.hello());
        //System.out.println(userService.transactions());
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       testMysql(context);
    }
}
