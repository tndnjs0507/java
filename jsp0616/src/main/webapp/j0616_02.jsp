<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
		<h2>1번째 페이지입니다.</h2>
		<script>location.href="top.jsp";</script> <!-- java script -->
		<%-- <% response.sendRedirect("top.jsp); %> 보내는 방법, 주소바뀜, jsp코드--%>
		
		<%--<jsp:forward page="top.jsp" />보내는 방법, 주소 안바뀜--%>
	
	</body>
</html>