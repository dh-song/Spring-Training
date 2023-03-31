Vue
	.createApp({
		data() {
			return {
				test: "hell",
				list: [
					{ id: 1, name: "아메리카노오", price: 5000 },
					{ id: 2, name: "카페라떼", price: 5500 }
				],
				isShowRegForm: true
				,
				menu: { name: "", price: "" }
			};
		},
		methods: {

			menuSaveHandler(e) {
				var myHeaders = new Headers();
				myHeaders.append("Content-Type", "application/json");

				var raw = JSON.stringify({
					"name": this.menu.name,
					"price": this.menu.price
				});

				var requestOptions = {
					method: 'POST',
					headers: myHeaders,
					body: raw,
					redirect: 'follow'
				};

				fetch("http://localhost:8080/menus", requestOptions)
					.then(response => response.text())
					.then(result => console.log(result))
					.catch(error => console.log('error', error));
					
				console.log(this.menu.name);
			},

		/*async*/ categoryClickHandler(e) {
				console.log("click");
				this.load();
				//			let response = await fetch("/menus");
				//			let list = await response.json();
				//			console.log(list);


				//			this.load(e.target.dataset.id);
				//			await this.load2(e.target.dataset.id);
				//			this.load(e.target.dataset.id);
				//			console.log("click-end");

			},

			menuAddHandler(e) {
				this.isShowRegForm = !this.isShowRegForm;
				console.log("메뉴추가");

			},

			load() {
				//			let response = await fetch("/menus");
				//			let list =   response.json();
				//			console.log(list);

				fetch("/menus")
					.then(response => {
						return response.json();
					})
					.then(list => {
						this.list = list;
					})
					.catch(error => {
						console.log("에러");
					});

				//			return new Promise(resolve=>{
				//				setTimeout(()=>{
				//			console.log("load");
				//			},2000)});
			},

			//		load(cid){
			//			return new Promise(resolve=>{
			//				setTimeout(()=>{
			//			console.log("load");
			//			},2000)});
			//		},
			//		load2(cid){
			//			return new Promise(resolve=>{
			//				setTimeout(()=>{
			//			console.log("load2");
			//			},2000)
			//			});
			//		},
		},

		beforeCreate() { console.log("beforeCreate") },
		created() { console.log("created") },
		beforeMount() { console.log("beforeMount") },
		mounted() {
			this.load(),
				console.log("mounted")
		},

		beforeUpdate() { console.log("beforeUpdate") },
		updated() { console.log("updated") },
		beforeUnmount() { console.log("beforeUnmount") },
		unmounted() { console.log("unmounted") }


	})
	.mount("#main-section");
