package com.mahu.Test;

import com.mahu.demo4.Service.AccountService;
import org.junit.Test;

/**
 * Created by simahu on 2017/3/16.
 */
public class Test4 extends UnitTestBase {
    public Test4() {
        super("spring-config4.xml");
    }

    @Test
    public void TestByAninotation(){
        AccountService accountService=super.getBean("accountService");
        accountService.transfer("ccc","bbb",200d);
    }

}
