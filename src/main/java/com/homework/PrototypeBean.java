package com.homework;

import org.apache.log4j.Logger;

public class PrototypeBean {
    private static Logger log = Logger.getLogger(PrototypeBean.class.getName());
    private int id;

    public PrototypeBean() {
        id = NumberGenerator.getUnigueNumber();
    }

    public int getId() {
        return id;
    }

    public void initObjectPrototype(){
        log.info("Prototype object initialisation..");
    }

    public void destroyObjectPrototype(){
        log.info("Destroy prototype object.");
    }
}
