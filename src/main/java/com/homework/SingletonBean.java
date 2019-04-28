package com.homework;

import org.apache.log4j.Logger;

public class SingletonBean {
    private static Logger log = Logger.getLogger(SingletonBean.class.getName());
    private int id;
    public SingletonBean() {
        id = NumberGenerator.getUnigueNumber();
    }

    public int getId() {
        return id;
    }

    private void destroySingleton() {
        log.info("Singleton destroy...");
    }

    private void initSingleton() {
        log.info("Singleton init...");
    }
}
