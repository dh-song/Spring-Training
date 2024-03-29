<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<main>
		<section>
			<header class="search-header">
				<h1 class="text-title1-h1">알랜드 메뉴</h1>
				<form>
					<input type="text">
					<input type="submit" class="icon icon-find">
				</form>
			</header>
			<aside class="aside-bar">
				<h1>aside</h1>
				<section class="aside-bar-content">
					<h1>메인메뉴</h1>
					<ul class="mt-3">
						<li><a href="">카페메뉴</a></li>
						<li><a href="">공지사항</a></li>
						<li><a href="/user/login.html">로그인</a></li>
					</ul>
				</section>
			</aside>
			<nav class="menu-category">
				<div>
					<h1 class="text-normal-bold">메뉴분류</h1>
				</div>
				<ul>
					<li class="menu-selected">
						<a href="/menu/list">전체</a>
					</li>
					<li>
						<a href="">커피음료</a>
					</li>
					<li>
						<a href="">수제청</a>
					</li>
					<li>
						<a href="">샌드위치</a>
					</li>
					<li>
						<a href="">쿠키</a>
					</li>
				</ul>
			</nav>

			<section class="cart-section">
				<h1 class="d-none">장바구니</h1>
				<span class="text-title3">커피음료</span>
				<div class="icon icon-basket icon-text">1</div>
			</section>

			<section class="menu-section">
		        <h1 class="d-none">메뉴목록</h1>
		        <div class="menu-list">
		            <section class="menu">
		                <form class="">
		                    <h1>알랜드 커피</h1> 
		                    <div class="menu-img-box">
		                        <a href="detail.html"><img class="menu-img" src="/image/product/12.png"></a>
		                    </div>    
		                    <div class="menu-price">4500 원</div>
		                    <div class="menu-option-list">
		                        <span class="menu-option">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>ICED</label>
		                        </span>            
		                        <span class="menu-option ml-2">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>Large</label>
		                        </span>
		                    </div>
		                    <div class="menu-button-list">
		                        <input class="btn btn-fill btn-size-1 btn-size-1-lg" type="submit" value="담기">
		                        <input class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit" value="주문하기">
		                    </div>
		                </form>
		            </section>
		            <section class="menu">
		                <form class="">
		                    <h1>알랜드 커피</h1> 
		                    <div class="menu-img-box">
		                        <img class="menu-img" src="/image/product/12.png">
		                    </div>    
		                    <div class="menu-price">4500 원</div>
		                    <div class="menu-option-list">
		                        <span class="menu-option">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>ICED</label>
		                        </span>            
		                        <span class="menu-option ml-2">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>Large</label>
		                        </span>
		                    </div>
		                    <div class="menu-button-list">
		                        <input class="btn btn-fill btn-size-1 btn-size-1-lg" type="submit" value="담기">
		                        <input class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit" value="주문하기">
		                    </div>
		                </form>
		            </section>
		            <section class="menu">
		                <form class="">
		                    <h1>알랜드 커피</h1> 
		                    <div class="menu-img-box">
		                        <img class="menu-img" src="/image/product/12.png">
		                    </div>    
		                    <div class="menu-price">4500 원</div>
		                    <div class="menu-option-list">
		                        <span class="menu-option">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>ICED</label>
		                        </span>            
		                        <span class="menu-option ml-2">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>Large</label>
		                        </span>
		                    </div>
		                    <div class="menu-button-list">
		                        <input class="btn btn-fill btn-size-1 btn-size-1-lg" type="submit" value="담기">
		                        <input class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit" value="주문하기">
		                    </div>
		                </form>
		            </section>
		            <section class="menu">
		                <form class="">
		                    <h1>알랜드 커피</h1> 
		                    <div class="menu-img-box">
		                        <img class="menu-img" src="/image/product/12.png">
		                    </div>    
		                    <div class="menu-price">4500 원</div>
		                    <div class="menu-option-list">
		                        <span class="menu-option">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>ICED</label>
		                        </span>            
		                        <span class="menu-option ml-2">
		                            <input class="menu-option-input" type="checkbox">
		                            <label>Large</label>
		                        </span>
		                    </div>
		                    <div class="menu-button-list">
		                        <input class="btn btn-fill btn-size-1 btn-size-1-lg" type="submit" value="담기">
		                        <input class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit" value="주문하기">
		                    </div>
		                </form>
		            </section>
		        </div>
		    </section>

			<div class="d-flex justify-content-center py-3">
				<a href="" class="btn btn-round w-100 w-50-md py-2">더보기(13+)</a>
			</div>

			<section class="new-menu menu-section-p">
				<h1 class="d-none">신메뉴 목록</h1>
				<!-- <ul>
                    <li>
                    </li>
                </ul>  -->
				<div class="list">
					<span>신규로 출시된 메뉴가 없습니다.</span>
				</div>
			</section>

		</section>
	</main> 
  
</body>
</html>