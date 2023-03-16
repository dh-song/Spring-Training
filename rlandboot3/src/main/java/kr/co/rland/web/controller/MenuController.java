package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/menu")
public class MenuController {

	@RequestMapping("list")
	public String menuList(Model model) {
		model.addAttribute("data", "Hello");
		return "menu/list";
	}
	
	@RequestMapping("detail")
	public String menuDetail() {
		return "menuDetail";
	}
}
