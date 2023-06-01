package com.myshop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		boolean flag = false;
		HttpSession session=request.getSession(false);
		if(session!=null&&session.getAttribute("member")!=null) {
			flag=true;
			System.out.println("실행 성공"+ request.getRequestURI());
		}else {
			flag=false;
			System.out.println("실행 실패"); 
			response.sendRedirect("../member/loginForm.do");
		}
		
		return flag;
	}

	
}
