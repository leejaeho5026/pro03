package kr.go.gangneung.controller.notice;

import java.io.IOException;










import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.go.gangneung.dto.Notice;
import kr.go.gangneung.model.NoticeDAO;





@WebServlet("/GetNotice.do")
public class GetNoticeCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no"));
		NoticeDAO dao = new NoticeDAO();	
		Notice notice = new Notice();
		notice = dao.noticeDetail(no);

		request.setAttribute("notice", notice);	

	
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/notice/Getnotice.jsp");
		view.forward(request, response);	

		
		
	}

}
