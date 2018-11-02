package com.qf.firstWeb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.firstWeb.service.LoginService;
import com.qf.firstWeb.service.LoginServiceImply;

//第三种创建Servlet的方式，继承HttpServlet
public class LoginServlet2 extends HttpServlet{
	//可以通过表单的method来选择是哪种方法,两种方法之间互不影响
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		int count = loginService.login(name, password);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if(count > 0){
			out.print("登录成功");
		}else{
			out.print("登陆失败");
		}
	}

	
	//使用jdbc连接数据库，通过前台用户输入的数据，在数据库中查找是否有这样的数据，
	//如果有，显示登录成功反之显示登录失败
	private LoginService loginService = new LoginServiceImply();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		int count = loginService.login(name, password);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if(count > 0){
			out.print("登录成功");
		}else{
			out.print("登陆失败");
		}
	}
	
}
