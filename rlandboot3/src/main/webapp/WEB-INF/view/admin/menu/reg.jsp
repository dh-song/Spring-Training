<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<h1>입력 페이지 ${ww}</h1>
		<form method="post">
			<fieldset>
				<legend>입력 필드</legend>
				<div>
					<input type="text" name="title">
				</div>
				<div>
					<input type="submit" name="value" >
				</div>
			</fieldset>
		</form>
		
		<form action="/upload" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>파일 업로드 필드</legend>
				<div>
					<label>이미지 파일: </label>
					<input type="file" name="img">
				</div>
				<div>
					<input type="submit" value="등록">
				</div>
			</fieldset>
		</form>
	</section>

</body>
</html>