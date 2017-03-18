package com.mahu.Test;

import com.mahu.demo3.Service.AccountService;
import org.junit.Test;

/**
 * Created by simahu on 2017/3/16.
 */
public class Test3 extends UnitTestBase{
    public Test3() {
        super("spring-config3.xml");
    }

    @Test
    public void tcByAspectJ(){
        AccountService accountService=super.getBean("accountService");
        accountService.transfer("bbb","ccc",200d);
    }
}
