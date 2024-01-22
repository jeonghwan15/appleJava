/**
 * 
 */
 
 
 $(function()
 	$("#signup_bt").on("click",function({
		if( $("#id").val() == ''){
			alert("아이디 입력하세요");
			$("#id").focus();
		}else if( $("#pw"").val() == ''){
			$("#pw2").val("");
			$("#pw").focus();	
		}else if( $("#email").val() == ''){
			alert("이메일을 입력해주세요")
			$("#email").focus();
		}else if( $("#tel").val() == ''){
			alert("전화번호를 입력해주세요")
			$("#tel").focus();
		}else{
			$("#signFm").submit(); // 모두 다 입력했다면
		}
	});
});