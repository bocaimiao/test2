package com.qf.firstWeb.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//第一种创建Servlet的方法，实现Servlet接口
public class LoginServlet implements Servlet{

	@Override
	//初始化servlet
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet对象被创建");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	//服务端方法和操作
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		System.out.println(name+password);
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	//销毁servlet
	public void destroy() {
		System.out.println("Servlet被销毁");
	}

}
