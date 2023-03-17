package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;

//@RestController
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
		
	@RequestMapping("list")
	public String menuList(Model model) {
		
//		service.getList();
		List<MenuView> list = service.getViewList(1);
//		service.getList(1, 1);
//		service.getList(1, "쿼리");
//		service.getList(1, 1, "쿼리");
		model.addAttribute("list", list);
		return "menu/list";
	}
	
	@RequestMapping("detail")
	public String menuDetail() {
		return "menu/detail";
	}
}
