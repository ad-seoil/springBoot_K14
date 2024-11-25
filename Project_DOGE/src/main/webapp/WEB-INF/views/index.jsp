<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<title> 이지스 퍼블리싱 | HOME </title>
<link rel="stylesheet" href="css/common.css">
<link rel="stylesheet" href="css/main.css">
<script src="js/jquery.js"></script>
<script src="js/jquery.bxslider.min.js"></script>
<script src="js/isotope.pkgd.min.js"></script>
<script src="js/common.js"></script>
<script src="js/main.js"></script>
<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/PIE.js"></script>
	<script>
		$(function(){
			if (window.PIE) {
				$('.rounded').each(function() {
								PIE.attach(this);
				});
			}
		});
	</script>
	<style>
		body{min-width:1024px;}
	</style>
<![endif]-->
</head>
<body>
	<!--헤더 영역-->
	<div id="header-wrap">
		<header class="header-inner">
			<h1>
				<a href="#">
				<picture>
					<source media="(max-width:800px)" srcset="images/common/logo-white.png">
					<img src="images/common/logo.jpg" alt="이지스 퍼블리싱">
				</picture>
				</a>
			</h1>
			<p class="mobile-menu-open">
				<button>
					<span class="blind">메뉴 열기</span>
					<span></span>
					<span></span>
					<span></span>
				</button>
			</p>
			<div class="mobile-menu-wrap">
				<div class="mobile-menu-scroll">
					<ul class="site-choice">
						<li><a href="#"><img src="images/common/top-tab-1-ov.jpg" alt="이지스 퍼블리싱"></a></li>
						<li><a href="#"><img src="images/common/top-tab-2.jpg" alt="이지스 에듀"></a></li>
					</ul>
					<ul class="util-menu">
						<li><a href="#">Home</a></li>
						<li><a href="#">Login</a></li>
						<li><a href="#">Member</a></li>
						<li><a href="#">Sitemap</a></li>
					</ul>
					<nav id="gnb">
						<h2 class="blind">메인메뉴</h2>
						<ul>
							<li class="m1">
								<a href="#" >ABOUT</a>
								<ul>
									<li><a href="#">이지스 퍼블리싱(주) 소개</a></li>
									<li><a href="#">뉴스와 홍보자료</a></li>
									<li><a href="#">찾아오시는 길</a></li>
								</ul>
							</li>
							<li class="m2">
								<a href="#">BOOK</a>
								<ul>
									<li><a href="#">전체 보기</a></li>
									<li><a href="#">분야별 보기</a></li>
									<li><a href="#">시리즈 보기</a></li>
									<li><a href="#">전자책 보기</a></li>
									<li><a href="#">이지스 에듀 도서 보기</a></li>
								</ul>
							</li>
							<li class="m3">
								<a href="#">COMMUNITY</a>
								<ul>
									<li><a href="#">공지사항</a></li>
									<li><a href="#">뉴스</a></li>
									<li><a href="#">이벤트</a></li>
									<li><a href="#">자료실</a></li>
									<li><a href="#">질문과 답변</a></li>
								</ul>
							</li>
							<li class="m4 no-sub">
											<a href="#">동영상 강의</a>
							</li>
						</ul>
					</nav>
				</div>
				<p class="mobile-menu-close">
					<button>
						<span class="blind">메뉴닫기</span>
						<span></span>
						<span></span>
					</button>
				</p>
			</div>
		</header>
	</div>
	<!--//헤더 영역-->
	<!--콘테이너 영역-->
	<div id="container">
		<section id="main-visual" class="rounded">
			<h3 class="blind">HOT BOOK</h3>
			<ul class="main-visual-slide">
				<li>
					<div class="visual-item-wrap item1">
					<h4 class="visual-title">Do it! 안드로이드 앱 프로그래밍 &lt;전면 개정 4판&gt;</h4>
					<p>
						<span> 6년 연속 안드로이드 분야 1위!<br>
						전면 개정 4판(안드로이드 7.0 누가 버전 · 안드로이드 스튜디오 반영판)으로 그 명성을 이어간다!</span>
					</p>
					<p class="detail-view"><a href="#">자세히 보기</a></p>
					</div>
				</li>
				<li>
					<div class="visual-item-wrap item2">
					<h4 class="visual-title">Do it! HTML5+CSS3 웹 표준의 정석 &lt;개정판&gt;</h4>
					<p>
						<span> 웹 분야 1위 도서! <br>
						HTML 5.1 최종 표준안으로 전면 개정!<br>
						웹의 기본만큼은 권위자에게 정석대로 배우자</span>
					</p>
					<p class="detail-view"><a href="#">자세히 보기</a></p>
					</div>
				</li>
				<li>
					<div class="visual-item-wrap item3">
					<h4 class="visual-title">Do it! 웹 사이트 기획 입문</h4>
					<p>
						<span> 지금까지 웹 사이트 설계도를 모두 공개한 책은 없었다! 쇼핑몰 제작 전 과정을 따라 하며 웹 기획자의 일을 구체적으로 배우는 책! 단언컨대, 실무 2년보다 이 책 한 권이 낫습니다.</span>
					</p>
					<p class="detail-view"><a href="#">자세히 보기</a></p>
					</div>
				</li>
			</ul>
		</section>
		<section id="notice-tab-wrap" class="rounded">
			<h3 class="sec-tit-1">NOTICE &amp; NEWS</h3>
			<h4 class="tab-btn-1"><a href="#" class="on">공지사항</a></h4>
			<div class="tab-container-1">
				<ul>
					<li><a href="#">공지사항 관련된 내용입니다.</a><span>2017.08.07</span></li>
					<li><a href="#">공지사항 관련된 내용입니다.</a><span>2017.08.07</span></li>
				</ul>
				<p class="icon-more"><a href="#">more</a></p>
			</div>
			<h4 class="tab-btn-2"><a href="#">새소식</a></h4>
			<div class="tab-container-2">
				<p class="no-write">등록된 내용이 없습니다.</p>
			</div>
		</section>
		<section id="best-book-wrap">
			<h3 class="sec-tit-1">BEST BOOK</h3>
			<ul class="best-book-list grid">
				<li class="grid-item">
					<p><a href="#"><img src="images/main/main-best-1.jpg" alt=""></a></p>
					<p><a href="#"><img src="images/main/main-best-2.jpg" alt=""></a></p>
				</li>
				<li class="grid-item">
					<a href="#"><img src="images/main/main-best-3.jpg" alt=""></a>
				</li>
				<li class="grid-item">
					<p><a href="#"><img src="images/main/main-best-4.jpg" alt=""></a></p>
					<p><a href="#"><img src="images/main/main-best-5.jpg" alt=""></a></p>
				</li>
				<li class="grid-item">
						<a href="#"><img src="images/main/main-best-6.jpg" alt=""></a>
				</li>
			</ul>
		</section>
	</div>
	<!--//콘테이너 영역-->
	<!--푸터 영역-->
	<div id="footer-wrap">
		<footer id="footer">
			<small>Copyright&copy;2015 이지스퍼블리싱㈜ EasysPublishing Co., Ltd. All Rights Reserved</small>
		</footer>
	</div>
	<!--//푸터 영역-->
</body>
</html>