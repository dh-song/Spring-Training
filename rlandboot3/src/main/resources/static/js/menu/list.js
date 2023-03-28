window.addEventListener("load",function(){
	let ul = document.querySelector(".menu-category>ul");
	const menuList = document.querySelector(".menu-list");
	const form = document.querySelector(".search-header form");
	const findButton = form.querySelector(".icon-find");
	
	findButton.onclick = function(e){
		e.preventDefault(e);
		const queryInput = form.querySelector("input[name=q]");
		let query = queryInput.value;
		
		const request = new XMLHttpRequest();
		request.onload = function(){
			let menus = JSON.parse(request.responseText); 

			
			bind(menus);
			
		}
		request.open("GET", `http://localhost:8080/menus?q=${query}`, true); //동기 true
		request.send();

	}
	ul.onclick = function(e){
		e.preventDefault();
		let tagName = e.target.tagName;
		if(tagName != 'LI' && tagName != 'A'){
			return;
		}
		
	let elLi = (tagName === 'LI') ? e.target : e.target.parentNode;
	let curLi = ul.querySelector("li.menu-selected");
	
	if( elLi === curLi){
		return;
		} else {
		curLi.classList.remove("menu-selected");
		elLi.classList.add("menu-selected");
	}
	let categoryId = elLi.dataset.cid;
	
	const request = new XMLHttpRequest();
	request.onload = function(){
		
		let menus = JSON.parse(request.responseText); //콜백 비동기
		bind(menus);
			
	};
	request.open("GET", `http://localhost:8080/menus?c=${categoryId}`, true); //동기 true
	request.send();
	//console.log(request.responseText);
	
	
	
	/*
	// fetch API
	var requestOptions = {
  method: 'GET',
  redirect: 'follow'
};

fetch("http://localhost:8080/menus?p=1&c=1&q=아메", requestOptions)
  .then(response => response.text())
  .then(result => console.log(result))
  .catch(error => console.log('error', error));
	*/
	
	
	
	/*
	// xhr
	var xhr = new XMLHttpRequest();
xhr.withCredentials = true;

xhr.addEventListener("readystatechange", function() {
  if(this.readyState === 4) {
    console.log(this.responseText);
  }
});

xhr.open("GET", "http://localhost:8080/menus?p=1&c=1&q=%EC%95%84%EB%A9%94");

xhr.send();
 */	
};

function bind(menus){
	menuList.replaceChildren();
		//menyList.innerHTML = "";
		console.log(menus[0]);
		
		for(let m of menus){
		let template = `<section class="menu">
					<form class="">
						<h1>
							<span>${m.name}</span>/<span
								>${m.categoryName}</span>
						</h1>
						<div class="menu-img-box">
							<a href="detail"><img class="menu-img" src="/image/product/${m.img}"></a>
						</div>
						<div class="menu-price" ">${m.price}+'원'</div>
						<div class="menu-option-list">
							<span class="menu-option"> <input
								class="menu-option-input" type="checkbox"> <label>ICED</label>
							</span> <span class="menu-option ml-2"> <input
								class="menu-option-input" type="checkbox"> <label>Large</label>
							</span>
						</div>
						<div class="menu-button-list">
							<input class="btn btn-fill btn-size-1 btn-size-1-lg"
								type="submit" value="담기"> <input
								class="btn btn-line btn-size-1 btn-size-1-lg ml-1" type="submit"
								value="주문하기">
						</div>
					</form>
				</section>`
			menuList.insertAdjacentHTML("beforeend",template);
				}
//		let menuSection = document.createElement("section");
//		menuSection.className = "menu";
//		
//		let form = document.createElement("form");
//		form.className = "";
//		
//		menuSection.append(form);
//		menuList.append(menuSection);
	
	
};

});