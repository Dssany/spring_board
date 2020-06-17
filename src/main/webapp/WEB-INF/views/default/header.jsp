<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1{text-align:center;}
</style>
</head>
<body>
<header>
	<h1>CARE LAB</h1>
	<hr>
		<c:choose>
		<c:when test="${sessionScope.id ne null }">
		<div style="text-align:right;padding-right: 20px;">
		<a href="index">HOME</a>&nbsp;&nbsp;&nbsp;
		<a href="memberInfo">회원정보</a>&nbsp;&nbsp;&nbsp;
		<a href="logout">로그아웃</a>
		</div>
		</c:when>
		<c:otherwise>
		<div style="text-align:right;padding-right: 20px;">
		<a href="index">HOME</a>&nbsp;&nbsp;&nbsp;
		<a href="#">회원정보</a>&nbsp;&nbsp;&nbsp;
		<a href="loginpage">로그인</a>
		</div>
		</c:otherwise>
		</c:choose>
	<hr>
</header>
</body>
</html>