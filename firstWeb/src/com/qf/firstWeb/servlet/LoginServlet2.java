package com.qf.firstWeb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qf.firstWeb.service.LoginService;
import com.qf.firstWeb.service.LoginServiceImply;

//�����ִ���Servlet�ķ�ʽ���̳�HttpServlet
public class LoginServlet2 extends HttpServlet{
	//����ͨ������method��ѡ�������ַ���,���ַ���֮�以��Ӱ��
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		int count = loginService.login(name, password);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if(count > 0){
			out.print("��¼�ɹ�");
		}else{
			out.print("��½ʧ��");
		}
	}

	
	//ʹ��jdbc�������ݿ⣬ͨ��ǰ̨�û���������ݣ������ݿ��в����Ƿ������������ݣ�
	//����У���ʾ��¼�ɹ���֮��ʾ��¼ʧ��
	private LoginService loginService = new LoginServiceImply();
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		String name=request.getParameter("uname");
		String password=request.getParameter("upwd");
		int count = loginService.login(name, password);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		if(count > 0){
			out.print("��¼�ɹ�");
		}else{
			out.print("��½ʧ��");
		}
	}
	
}
