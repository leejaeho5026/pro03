package com.myshop.controller.sales;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myshop.dto.Product;
import com.myshop.dto.User;
import com.myshop.model.ProductDAO;
import com.myshop.model.UserDAO;

@WebServlet("/AddSales.do")
public class AddSalesCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pcode = request.getParameter("pcode");
		String id = request.getParameter("id");
		
		//장바구니에서 넘어온 데이터 처리
		String bnum = "";
		int amount = 1;
		String pcs = request.getParameter("amount");		
		if(request.getParameter("bnum")!=null){
			bnum = request.getParameter("bnum");
			amount = Integer.parseInt(pcs);
			request.setAttribute("bnum", bnum);
			request.setAttribute("amount", amount);
		}

		//상품 정보 로딩
		String msg = "제품을 구매합니다.";
		ProductDAO dao = new ProductDAO();
		Product pro = dao.getProduct(pcode);
		
		//사용자 정보 로딩
		UserDAO udao = new UserDAO();
		User user = new User();
		try {
			user = udao.myInfo(id);
		} catch (InvalidKeyException | NoSuchPaddingException
				| NoSuchAlgorithmException | InvalidKeySpecException
				| InvalidAlgorithmParameterException | BadPaddingException
				| IllegalBlockSizeException e) {
			e.printStackTrace();
		}
		
		request.setAttribute("user", user);	//구매자 정보
		request.setAttribute("pro", pro);	//한 개의 상품 정보
		
		request.setAttribute("id", id);
		request.setAttribute("msg", msg);
		
		//디스패치로 view를 생성하여 addSales.jsp로 요청 받은 proList를 포워드
		RequestDispatcher view = request.getRequestDispatcher("/sales/addSales.jsp");
		view.forward(request, response);
	}
}
