package com.mahu.demo2.Service.ServiceImpl;

import com.mahu.demo2.DAO.AccountDAO;
import com.mahu.demo2.Service.AccountService;



/**
 * Created by simahu on 2017/3/15.
 */
public class AccountServiceImpl implements AccountService {
    /*注入DAO*/
    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }




    @Override
    public void transfer( String outAccount, String inAccount, double money) {


        accountDAO.inMoney(inAccount,money);

//        int i=1/0;


        accountDAO.outMoney(outAccount,money);


    }

    @Override
    public void aaa() {
        System.out.println("AccountServiceImpl");
        accountDAO.aaa();
    }
}
