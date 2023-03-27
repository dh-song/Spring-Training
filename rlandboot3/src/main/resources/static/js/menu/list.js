window.addEventListener("load",function(){
	let ul = document.querySelector(".menu-category>ul");
	const menuList = document.querySelector(".menu-list");
	
	ul.onclick = function(e){
		e.preventDefault();
		let tagName = e.target.tagName;
		if(tagName != 'LI' && tagName != 'A'){
			return;
		}
		
	let elLi = (tagName === 'LI') ? e.target : e.target.parentNode;
	
	
	
	let categoryId = elLi.dataset.cid;
	
	const request = new XMLHttpRequest();
	request.onload = function(){
		let menus = JSON.parse(request.responseText); //콜백 비동기
		menuList.replaceChildren();
		console.log(menus[0]);
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
}
})