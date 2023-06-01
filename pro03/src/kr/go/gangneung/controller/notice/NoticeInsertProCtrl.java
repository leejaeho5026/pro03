package kr.go.gangneung.controller.notice;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import kr.go.gangneung.dto.Notice;
import kr.go.gangneung.model.NoticeDAO;

@WebServlet("/NoticeInsertPro.do")
public class NoticeInsertProCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html charset=UTF-8");

		String title = "";
		String content = "";
		String file1 = "";
		NoticeDAO dao = new NoticeDAO();
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setFile1(file1);
		
		int cnt = dao.noticeUpdate(notice);

			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/notice/insertNotice.jsp");
			view.forward(request, response);

		
		}
}
	


