package com.homework;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SingletonBean implements InitializingBean, DisposableBean {
    private static final Logger LOGGER = Logger.getLogger(SingletonBean.class.getName());

    private int id;
    public SingletonBean() {
        id = NumberGenerator.getUnigueNumber();
    }

    public int getId() {
        return id;
    }

    private void destroySingleton() {
        LOGGER.info("Singleton destroy...");
    }

    private void initSingleton() {
        LOGGER.info("Singleton init...");
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info(this + "metod destroy singleton");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info(this + "metod init singleton");
    }
}
