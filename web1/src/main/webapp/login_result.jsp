<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>    
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	boolean isFail=false;
	
	Connection conn=null; // 접속정보
	Statement st=null;  // sql질의문 전달
	ResultSet rs=null;	// 질의에 대한 결과 받기
	
	try{
		String url="jdbc:mysql://localhost:3306/javaTest";
		String user="javaTest";
		String password="123456";
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,password);
		
	}catch(Exception e){
		System.out.println("드라이버 로드 및 데이터베이스 접속 실패 - 로그인");
		e.printStackTrace();
	}
	
	try{
		String sql = "select * from member_model1 where id = '"+id+"' and pw='"; // sql질의문으로 조회
		st
		
		while(rs.next){
		
	}catch(SQLException e){
		
	}
	
	
	
	// 아이디 또는 비밀번호가 올바르지 않다면
	if(isFail){
		session.setAttribute("fail","111123");
		response.sendRedirect("login.jsp");
	}
%>
<script>
	//location.href="login.jsp?fail=1";
	// history.back();
</script>
