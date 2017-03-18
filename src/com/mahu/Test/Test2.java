package com.mahu.Test;

import com.mahu.demo2.Service.AccountService;
import org.junit.Test;

/**
 * Created by simahu on 2017/3/16.
 */
public class Test2 extends UnitTestBase {
    public Test2() {
        super("spring-config2.xml");
    }

    @Test
    public void tcByProxyFactoryBean(){
        AccountService accountService=super.getBean("accountServiceProxy");
        accountService.transfer("ccc","aaa",200);
    }

}
