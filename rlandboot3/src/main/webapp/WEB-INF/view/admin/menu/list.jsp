<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메뉴 목록 페이지</h1>
	<nav>
		<h1>페이저</h1>
		<form action="">
			<label>size:</label>
			<select name="s">
			<option value="10">10</option>
			<option value="20">20</option>
			<option value="30">30</option>
			</select>
		</form>
		<ul>
			<c:forEach var="n" begin="1" end="5">
				<li><a href="list?p=${n}&q=hello">${n}</a>
			</c:forEach>
		</ul>
	</nav>
</body>
</html>