<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> Ajax </title>
<script src="js/jquery.js"></script>
<script>
$(function() {
	var href = "http://localhost/9장/member.php?callback=myFnc";
	$.ajax({
		url: href,
		dataType: "jsonp"
	}).done(function myTest(data){
		if(data.length > 0) {
			var $table = $("<table />");
			data.forEach(function(o){
				$id = o.id;
				$name = o.name;
				$email = o.email;

				var trTag = $("<tr />");
				trTag.append(
					$("<td/>").text($id),
					$("<td/>").text($name),
					$("<td/>").text($email)
				);

				$table.append(trTag);
			});

			$(".wrap").append($table);
		}
	});
});
</script>
</head>
<body>
	<div class="wrap"></div>
</body>
</html>