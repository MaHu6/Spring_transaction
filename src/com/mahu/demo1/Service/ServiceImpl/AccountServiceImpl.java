package com.mahu.demo1.Service.ServiceImpl;

import com.mahu.demo1.DAO.AccountDAO;
import com.mahu.demo1.Service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;


/**
 * Created by simahu on 2017/3/15.
 */
public class AccountServiceImpl implements AccountService {
    /*注入DAO*/
    private AccountDAO accountDAO;

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    /*
    * 注入事务管理模板
    * */
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer( String outAccount, String inAccount, double money) {


        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {


                System.out.println(transactionStatus.isRollbackOnly());
                accountDAO.inMoney(inAccount,money);


                System.out.println(transactionStatus.isRollbackOnly());

                accountDAO.outMoney(outAccount,money);
                System.out.println(transactionStatus.isRollbackOnly());

            }
        });


    }

    @Override
    public void aaa() {
        System.out.println("AccountServiceImpl");
        accountDAO.aaa();
    }
}
