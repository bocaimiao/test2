package com.qf.firstWeb.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//�ڶ��ִ���Servlet�ķ������̳�GenericServlet
public class LoginServlet1 extends GenericServlet{
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet����");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		System.out.println(name+password);
	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Servlet������");
	}
	

}
