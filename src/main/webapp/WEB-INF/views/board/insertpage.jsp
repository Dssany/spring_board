<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>게시글 등록<br>
<form action="insert">
	<table border="1" align="center">
	
		<tr>
			<th>이름</th><th><input type="text" name="name"></th>
		</tr>
		<tr>
			<th>제목</th><th><input type="text" name="title"></th>
		</tr>
			<th>내용</th><th><textarea name="content" style="width:300px;height:400px;"></textarea></th>
		<tr>
		</tr>
			<th><input type="submit" value="저장" ></th>
		
		<tr>
		
		</tr>
	</table>
		</form>
</body>
</html>