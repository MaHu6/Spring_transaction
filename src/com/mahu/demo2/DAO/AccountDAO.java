package com.mahu.demo2.DAO;

/**
 * Created by simahu on 2017/3/15.
 * 转账案例  DAO接口
 */
public interface AccountDAO {

    /*
  * 转出，
  * 账号
  * 金额
  * */
    public void outMoney(String out, double money);

    /*
    * 转入，
    * 账号
    * 金额
    * */
    public void inMoney(String in, double money);

    public void aaa();
}
