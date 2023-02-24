package kr.co.rland.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu/")
public class MenuController {

	@RequestMapping("list")
	public String menuList() {
		return "menuList";
	}
	
	@RequestMapping("detail")
	public String menuDetail() {
		return "menuDetail";
	}
}
