package com.qf.firstWeb.service;

import com.qf.firstWeb.dao.LoginDao;
import com.qf.firstWeb.dao.LoginDaoImply;

public class LoginServiceImply implements LoginService {
	private LoginDao loginDao = new LoginDaoImply();
	public int login(String name, String password) {
		return loginDao.login(name, password);
	}
	
}
