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
<header>
	<jsp:include page="../default/header.jsp" flush="false"/>
	</header>
	<main>
		<div style="text-align:center">
			<h1 >회 원 정 보</h1>
			<table border="1" align="center">
	<tr>
		<th>아이디</th><th>비밀번호</th>
	</tr>
	<c:forEach items="${list }" var="dto">
		<tr>
			<th><a href="select?id=${dto.id }">${dto.id }</a></th>
			<th>${dto.pw }</th>
		</tr>
	</c:forEach>

</table>	
		
		
		
		
		
		
		
		</div>
		
	</main>
	<footer>
	<jsp:include page="../default/footer.jsp" flush="false"/>
	
	</footer>
</body>
</html>