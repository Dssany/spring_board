<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:choose>
			<c:when test="${list eq 1}">
				<c:redirect url="resultlogin?re=1"/>
			</c:when>
			<c:when test="${list eq 0}">
				<c:redirect url="resultlogin?re=0"/>
			</c:when>
			<c:otherwise>
				<c:redirect url="resultlogin?re=0"/>
			</c:otherwise>
		</c:choose>

</body>
</html>