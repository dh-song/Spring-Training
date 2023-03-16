package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/menu/")
public class MenuController {

	@RequestMapping("list")
	public String menuList() {
		return "menulist";
	}
	
	@RequestMapping("detail")
	public String menuDetail() {
		return "menuDetail";
	}
}
