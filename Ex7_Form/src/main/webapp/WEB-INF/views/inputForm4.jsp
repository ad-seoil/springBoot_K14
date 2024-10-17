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
		<form action="/test4Proc">
			<fieldset>
				<legend>로그린 정보</legend>
					<ul>
						<li>
							<label for="id">id</label>
							<input type="text" name="id">
						</li>
						<li>
							<label for="name">name</label>
							<input type="text" name="name">
						</li>
						<li>
							<label for="pwd">pwd</label>
							<input type="text" name="pwd">
						</li>
						<li>
							<label for="mail">mail</label>
							<input type="text" name="mail">
						</li>
						<li>
							<label for="addr">addr</label>
							<input type="text" name="addr">
						</li>
					</ul>
				<input type = "submit" value = "전송">
			</fieldset>
		</form>
	</div>
</body>
</html>