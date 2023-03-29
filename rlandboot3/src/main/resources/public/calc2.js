Vue
.createApp({
	data(){
		let x = 30;
		let y = 50;
		let z = 0;
		
		return{x,y,z};
	},
	methods:{
		calcHandler(e){
//			e.preventDefault();
//			this.z = parseInt(this.x)+parseInt(this.y);
			this.z = parseInt(this.x)+this.y;
			console.log(this.z);
		},
		resetHandler(e){
			e.preventDefault();
			console.log("reset-handler");
		}
	}
})
.mount("#calc");