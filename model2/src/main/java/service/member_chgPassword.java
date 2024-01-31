package service;

public class member_chgPassword implements member_action{
	
	@Override
	

	if( authNum.equals(num) ) { // 인증번호가 일치한다면
		
		request.setAttribute("prt", "member/newPassword")
	
	}else {// 회원가입 안된 이메일 주소일 경우
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		response.getWriter().append(""
			+"<script> alert('인증번호가 일치 하지 않습니다.'); history.back();</script>");
	
	return null;
	}

	return "/";
	}
}