<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String email = request.getParameter("email");
	String tel = request.getParameter("tel");
	
	// 1. 드라이버 로드
	// 2. 데이터베이스 접속
	// 3. sql쿼리문 작성 및 전달
	try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(ClassNotFoundException e){
		System.out.println("드라이버 로드 실패 - 회원가입");
	}
	
	Connection conn = null;
	
	try{
		
		String sql="insert into member_model1(id,pw,email,tel)";
		  sql +="values( '"+id+"', '"+pw+"', '"+email+"','"+tel+"' )";
		  
		  st. conn.createStatement();
		  st.executeUpdate(sql);
		  
		  response.sendRedirect("/web1/");
		
	}catch(SQLException e){
		System.out.println("데이터베이스 접속 실패 - 회원가입");
	}
%>