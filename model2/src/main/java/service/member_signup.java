package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.member_dao;

public class member_signup implements member_action{
	private member_dao mdao= new member_dao();
	
	public String[] emailList() {
		return mdao.findAllEmail();
	}
	
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
	request.setAttribute("prt","member/signup");
	request.setAttribute("emailList", emailList());
	return "/";
	
	}
}
