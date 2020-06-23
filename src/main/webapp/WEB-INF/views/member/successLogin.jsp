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
		<c:choose>
			<c:when test="${chk eq '1'}">
				<h1 >로그인 성공</h1>
			</c:when>
			<c:when test="${chk eq '0'}">
				<h1>비밀번호 불일치</h1>
			</c:when>
			<c:otherwise>
				<h1>존재하지 않는 회원입니다. 회원가입 후 이용하세요</h1>
			</c:otherwise>
		</c:choose>
		
	</main>
	<footer>
	<jsp:include page="../default/footer.jsp" flush="false"/>
	
	</footer>
</body>
</html>