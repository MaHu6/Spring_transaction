package com.mahu.demo4.Service.ServiceImpl;

import com.mahu.demo4.DAO.AccountDAO;
import com.mahu.demo4.Service.AccountService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by simahu on 2017/3/15.
 */
@Transactional(propagation = Propagation.REQUIRED,readOnly = false)
public class AccountServiceImpl implements AccountService {
    /*注入DAO*/
    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }




    @Override
    public void transfer( String outAccount, String inAccount, double money) {


        accountDAO.inMoney(inAccount,money);

        //int i=1/0;


        accountDAO.outMoney(outAccount,money);


    }

    @Override
    public void aaa() {
        System.out.println("AccountServiceImpl");
        accountDAO.aaa();
    }
}
