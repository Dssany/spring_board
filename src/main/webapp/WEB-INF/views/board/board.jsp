<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.wrap{width:400px;height:500px;text-align:center;margin: 0 auto;padding-top: 50px;}
	.name{text-align:right;}
	table{text-align:center;margin: 0 auto;}
</style>
</head>
<body>board.jsp<br>
<header>
	<jsp:include page="../default/header.jsp" flush="false"/>
	</header>
	<main>
<div style="text-align:center">
			<h1 >게 시 판</h1>
			<table border="1" align="center">
	<tr>
		<th>번호</th><th>이름</th><th>제목</th><th>날짜</th><th>조회수</th><th>group</th><th>step</th><th>indent</th>
	</tr>
	<c:forEach items="${list }" var="board">
		<tr>
			<th>${board.id }</th>
			<th>${board.name }</th>
			<th>${board.title }</th>
			<th>${board.savedate }</th>
			<th>${board.hit }</th>
			<th>${board.idgroup }</th>
			<th>${board.step }</th>
			<th>${board.indent }</th>
		</tr>
		<tr>
			<th><a href="boardinsert">글 작성</a></th>
		</tr>
	</c:forEach>

</table>	
</main>
<footer>
	<jsp:include page="../default/footer.jsp" flush="false"/>
	
	</footer>
</body>
</html>