package kr.go.gangneung.controller.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.go.gangneung.dto.User;
import kr.go.gangneung.model.UserDAO;


@WebServlet("/NoticeInsertCtrl.do")
public class InsertNoticeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("text/html; charset=UTF-8");
	
	
	
	
	
	RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/notice/noticeList.jsp");
	view.forward(request, response);	
	
	}

}
