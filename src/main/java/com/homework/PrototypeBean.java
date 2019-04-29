package com.homework;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class PrototypeBean extends AbstractFactoryBean<Object> {
    private static final Logger LOG = Logger.getLogger(PrototypeBean.class.getName());
    private int id;

    public PrototypeBean() {
        id = NumberGenerator.getUnigueNumber();
    }

    @Override
    protected Object createInstance() throws Exception {
            PrototypeBean prototypeBean = new  PrototypeBean();
            prototypeBean.getId();
            return prototypeBean;
        }

    @Override
    public Class<PrototypeBean> getObjectType() {
        return PrototypeBean.class;
    }
    @Override
    public String toString() {
        return "PrototypeBean [id=" + id + "]";
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
