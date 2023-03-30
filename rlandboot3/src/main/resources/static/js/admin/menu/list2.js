Vue
.createApp({
	data(){
		return{
			test:"hell"
		};
	},
	methods:{
		/*async*/ categoryClickHandler(e){
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

		async load(cid){
			let response = await fetch("/menus");
			let list =   response.json();
			console.log(list);

//			return new Promise(resolve=>{
//				setTimeout(()=>{
//			console.log("load");
//			},2000)});
//		},

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
//		}
	},
	
}})
.mount("#main-section");
