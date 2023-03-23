package kr.co.rland.web.controller.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("ApiMenuController")
public class MenuController {
	
	@GetMapping("/menus")
	public String getList(){
		
		return "menu List";
	}
	
	@GetMapping("/menus/3")
	public String get(int id){
		
		return "menu 3";
	}
	
	@PutMapping("/menus/3")
	public String edit(){
		
		return "menu edit";
	}
	
	@DeleteMapping("/menus/3")
	public String delete(int id){
		
		return "menu del";
	}
	
	@PostMapping("/menus")
	public String insert(){
		
		return "menu insert";
	}
}
