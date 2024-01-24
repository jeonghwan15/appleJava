package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;

public class member_login implements member_action{
	private member_dao dao = new member_dao();

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) throws IOException {
		if( request.getParameter("cmd")==null) {
		    request.setAttribute("prt", "member/signin" );
		return "/";
	}else { // 이메일과 비번으로 로그인 처리
		String email = request.getParameter("email");
		String pw = request.getParameter("pin");
		
		member user = dao.findByemailpw(email,pw);
		if( user == null) { // 로그인실패
			
		}else { // 로그인 성공
			
		}
		return null;
	}
		
	}
}
