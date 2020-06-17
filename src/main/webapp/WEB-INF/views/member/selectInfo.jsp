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

			<h1 >${select.id }정 보</h1>
			아이디 : ${select.id }
			비밀번호 : ${select.pw }
	
		</div>
		
	</main>
	<footer>
	<jsp:include page="../default/footer.jsp" flush="false"/>
	
	</footer>
</body>
</html>