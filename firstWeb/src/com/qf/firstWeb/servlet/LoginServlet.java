package com.qf.firstWeb.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//��һ�ִ���Servlet�ķ�����ʵ��Servlet�ӿ�
public class LoginServlet implements Servlet{

	@Override
	//��ʼ��servlet
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet���󱻴���");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	//����˷����Ͳ���
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
	//����servlet
	public void destroy() {
		System.out.println("Servlet������");
	}

}
