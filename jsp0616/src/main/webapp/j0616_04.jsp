<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>session</title>
	</head>
	<body>
	  <%
	   session.setAttribute("sessionId", "admin");
	   session.setAttribute("sessionNicName", "길동스");
	   session.setAttribute("sessionName", "홍길동");
	  %>
	  
	  <a href="session_confirm.jsp">섹션 재확인</a>
	</body>
</html>