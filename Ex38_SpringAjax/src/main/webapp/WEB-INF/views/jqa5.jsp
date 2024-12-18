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
	$.ajax({
		url:"/rss",
		dataType:"xml",
		success: function(data) {
			var $items = $(data).find("item");

			if($items.length > 0) {
				$items = $items.slice(0,20);
				var $ulTag = $("<ul />");
				$.each($items, function(i, o) {
					var $title = $(o).find("title").text();
					var $link = $(o).find("link").text();
					
					var $aTag = $("<a />")
					.attr({
						"href":$link,
						"target":"_blank"
						})
					.text($title);

					var $liTag = $("<li />")
					.append($aTag);

					$ulTag.append($liTag);
				});
				$(".wrap").append($ulTag);
			}
		}
	});
});
</script>
</head>
<body>
  <div class="wrap"></div>
</body>
</html>