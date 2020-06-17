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
<c:forEach items="${list }" var="list">
		<c:choose>
			<c:when test="${param.id eq list.id and param.pw eq list.pw}">
				<%
					String id = request.getParameter("id");
					String pw = request.getParameter("pw");
				
					session.setAttribute("id",id);
					session.setAttribute("pw", pw);
					session.setAttribute("re", 1);
				%>
				<c:redirect url="resultlogin"/>
			</c:when>
			<c:when test="${param.id eq list.id and param.pw ne list.pw}">
				<%session.setAttribute("re", 2); %>
				<c:redirect url="resultlogin?re=2"/>
			</c:when>
			<c:otherwise>
				<%session.setAttribute("re", 3); %>
				<c:redirect url="resultlogin?re=3"/>
			</c:otherwise>
		</c:choose>
		</c:forEach>
</body>
</html>