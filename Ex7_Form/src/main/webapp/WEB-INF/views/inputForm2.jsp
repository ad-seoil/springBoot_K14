<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력폼</title>
</head>
<body>
	<div>
		<form action="/test2-3">
			<fieldset>
				<legend>입력</legend>
				id : <input name = "id"> <br>
				name : <input name = "name"> <br>
				pwd : <input type = "password" name = "pwd"> <br>
				<input type = "submit" value = "전송">
			</fieldset>
		</form>
	</div>
</body>
</html>