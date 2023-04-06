package kr.co.rland.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller("adminHomeController")
@RequestMapping("admin")
public class HomeController {
	
	@GetMapping("index")
	public String index() {
		
		return "/admin/index";
	}
}
