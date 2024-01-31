<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div id="authWrap">
	<div class="input_box">
		<h3>인증번호 입력</h3>
		
		<p>
			입력하신 이메일로 인증번호를 입력해주세요.
		</p>
		<form method="post" action="/members/changePassword">
			<input type="text" name="authNum" id="authNum" placeholder="인증번호">
			<button>확 인</button>
		</form>
		<small id="time"></small>
		
	</div>
</div>
    
    
<style>
#authWrap{
	width:500px;
	margin:0 auto;
}
</style>
    
<c:set var="curTime" value="<%=new java.util.Date().getTime() %>"/>
<c:set var="maxTime" value="<%session.getMaxInactiveInterval() %>"/>
<c:set var="LastTime" value="<%session.getLastAccessedTime() %>"/>
<c:set var="reTime" value="${ (lastTime + maxTime * 1000 -curTime) /1000 }"/>

<script>
	let timeId=0;
	var time=parseInt( '$reTime');
	
	timeId = setInterval(function(){
		var min = parseInt(time/60)
		var sec = parseInt(time%60));
	$("#time").text(min+":"+sec);
	time--;
	if(time==0{
		clearInterval(timeId);
		$("#time").html("<a href='/members/findAuth'>재발송</a>")
	}
	
	
	}
	
</script>
    