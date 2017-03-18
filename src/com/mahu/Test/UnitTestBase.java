package com.mahu.Test;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by simahu on 2017/3/13.
 */
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @Before
    public void before(){
      context=new ClassPathXmlApplicationContext(springXmlPath);
      context.start();
    }


    @After
    public void after(){
        context.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <T extends Object> T getBean(String beanId){
        return (T) context.getBean(beanId);
    }

    protected <T extends Object> T getBean(Class<T> clszz){
        return context.getBean(clszz);
    }

}
