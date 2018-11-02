package com.qf.firstWeb.dao;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class LoginDaoImply implements LoginDao{
	//查询数据库,校验当前用户是否合法(jdbc)
		DataSource dataSource = new ComboPooledDataSource();
		QueryRunner qr = new QueryRunner(dataSource);
		
		@Override
		public int login(String name, String password) {
			String sql = "select count(1) from tt_user where name=? and password=?";
			Object[] params = new Object[]{name,password};
			Number count = null;
			try {
				count =  qr.query(sql, params, new ScalarHandler<Number>());
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return count.intValue();
		}
}
