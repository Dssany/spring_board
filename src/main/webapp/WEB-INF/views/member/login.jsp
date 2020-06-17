<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.wrap{width:800px;height:500px;text-align:center;margin: 0 auto;padding-top: 50px;}
	.wrap02{display: flex;}
	.logo{text-align:left;}
	.tablemain{text-align:center;margin: 0 auto;width:350px;}
	.tablesub{text-align:center;margin: 0 auto;}
	tbody{width:600px;}
</style>
</head>
<body>
	<header>
	<jsp:include page="../default/header.jsp" flush="false"/>
	</header>
	<main>
	<div class="wrap">
	<div class="wrap02">
		<h1 class="logo">로그인 페이지 입니다</h1>
		<form action="loginchk">
		<div>
			<table>
				<tr>
					<th><input type="text" name="id"></th>
				</tr>
				<tr>
				<th><input type="text" name="pw"><br></th>
				<th colspan="2"><input type="submit" value="로그인" style="height:50px"></th>
				
				</tr>
			
			</table>
		
		</div>
	</form>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	
<!-- 		<table class="tablemain"> -->
<!-- 		<tbody> -->
<!-- 		<tr> -->
<!-- 			<th> -->
<!-- 				<b style="font-size:30px">로그인 페이지 입니다</b> -->
<!-- 			</th> -->
<!-- 			<th> -->
<!-- 				<table class="tablesub"> -->
<!-- 					<tr> -->
<!-- 						<th><input type="text" name="id"></th> -->
<!-- 						<th colspan="2"><input type="submit" value="로그인" style="height:50px"></th> -->
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 					<th><input type="text" name="pw"><br></th> -->
<!-- 					</tr> -->
<!-- 				</table> -->
<!-- 			</th> -->
<!-- 		</tr> -->
<!-- 		</tbody> -->
<!-- 		</table> -->
</div>
	
	
	
	
	
	
	</main>
	<footer>
	<jsp:include page="../default/footer.jsp" flush="false"/>
	
	</footer>
</body>
</html>