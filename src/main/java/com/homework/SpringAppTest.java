package com.homework;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppTest {
    private static final Logger LOGGER = Logger.getLogger(SpringAppTest.class.getName());

    public static void main(String[] args) throws Exception {
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LOGGER.info( "------------Prototype Bean--------------------");
        FactoryBean prototypeBeanMesage = (FactoryBean) context.getBean("&prototypeBean");
        LOGGER.info( prototypeBeanMesage.getObject());
       prototypeBeanMesage = (FactoryBean) context.getBean("&prototypeBean");
        LOGGER.info( prototypeBeanMesage.getObject());
       prototypeBeanMesage = (FactoryBean) context.getBean("&prototypeBean");
        LOGGER.info( prototypeBeanMesage.getObject());

        LOGGER.info( "-------------Singleton Bean----------------");
        SingletonBean singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        LOGGER.info( "id"+ singletonBeanMesage.getId());
        singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        LOGGER.info( "id"+ singletonBeanMesage.getId());
        singletonBeanMesage = (SingletonBean) context.getBean("singletonBean");
        LOGGER.info( "id"+ singletonBeanMesage.getId());

        context.close();
    }
}
