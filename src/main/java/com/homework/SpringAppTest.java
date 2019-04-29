package com.homework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {
    public static void main(String[] args) {
        String configLocation;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        System.out.println( "------------Prototype Bean--------------------");
        PrototypeBean prototypeBeanMesage = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println( "id"+ prototypeBeanMesage.getId());
         prototypeBeanMesage = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println( "id"+ prototypeBeanMesage.getId());
        prototypeBeanMesage = (PrototypeBean) context.getBean("prototypeBean");
        System.out.println( "id"+ prototypeBeanMesage.getId());

        System.out.println( "-------------Singleton Bean----------------");
        SingletonBean singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        System.out.println( "id"+ singletonBeanMesage.getId());
        singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        System.out.println( "id"+ singletonBeanMesage.getId());
        singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        System.out.println( "id"+ singletonBeanMesage.getId());

        context.close();
    }
}
