package com.homework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.apache.log4j.Logger;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public static final Logger LOGGER = Logger.getLogger(MyBeanPostProcessor.class.getName());
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info(bean + "postProcessBeforeInitialization");
        return bean;
    }
}
