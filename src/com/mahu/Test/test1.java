package com.mahu.Test;

import com.mahu.demo1.Service.AccountService;
import org.junit.Test;

/**
 * Created by simahu on 2017/3/15.
 */

public class test1 extends UnitTestBase{

    public test1() {
        super("spring-config.xml");
    }

    @Test
    public void demo1Test(){
        AccountService accountService=super.getBean("accountService");
       accountService.transfer("aaa","bbb",200);
        accountService.aaa();
    }
}
