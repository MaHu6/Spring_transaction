package com.mahu.demo1.DAO.DAOImpl;

import com.mahu.demo1.DAO.AccountDAO;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by simahu on 2017/3/15.
 * 实现类
 */
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {
    @Override
    public void outMoney(String out, double money) {
        String sql="update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql,money,out);
    }

    @Override
    public void inMoney(String in, double money) {
        String sql="update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql,money,in);
    }

    @Override
    public void aaa() {
        System.out.println("AccountDAOImpl");
    }
}
