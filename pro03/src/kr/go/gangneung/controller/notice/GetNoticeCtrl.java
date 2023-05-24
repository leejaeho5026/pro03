package kr.go.gangneung.controller.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.go.gangneung.dto.Notice;
import kr.go.gangneung.model.NoticeDAO;



@WebServlet("/GetNoticeCtrl.do")
public class GetNoticeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		NoticeDAO dao = new NoticeDAO();
		Notice notice = new Notice();
		
		if(noice.get)
		request.setAttribute("no",no);		

		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/notice/noticeList.jsp");
		view.forward(request, response);	
		
		
		
	}

}
