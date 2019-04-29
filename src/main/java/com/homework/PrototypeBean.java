package com.homework;

import org.apache.log4j.Logger;

public class PrototypeBean {
    private static final Logger LOG = Logger.getLogger(PrototypeBean.class.getName());
    private int id;

    public PrototypeBean() {
        id = NumberGenerator.getUnigueNumber();
    }

    public int getId() {
        return id;
    }

    public void initObjectPrototype(){
        LOG.info("Prototype object initialisation..");
    }

    public void destroyObjectPrototype(){
        LOG.info("Destroy prototype object.");
    }
}
