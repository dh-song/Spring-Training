package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.entity.RcmdMenuView;
import kr.co.rland.web.service.CategoryService;
import kr.co.rland.web.service.DefaultCategoryService;
import kr.co.rland.web.service.MenuService;
import kr.co.rland.web.service.RcmdMenuService;

//@RestController
@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private RcmdMenuService rcmdMenuService;
		
	@RequestMapping("list")
	public String menuList(
			@RequestParam(name = "p", defaultValue = "1") int page,
			@RequestParam(name = "c" ,required = false) Integer categoryId,
			@RequestParam(name = "q" ,required = false) String query,
	Model model) {
		
		List<Category> categoryList = categoryService.getList();
//		service.getList();
//		List<MenuView> list = service.getViewList(1);
		List<MenuView> list = service.getViewList(page, categoryId, query);
//		service.getList(1, 1);
//		service.getList(1, "쿼리");
//		service.getList(1, 1, "쿼리");
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("list", list);
		
		
		
		return "menu/list";
	}
	
	@RequestMapping("detail")
	public String menuDetail(long id, Model model) {
		
		Menu menu = service.getById(id);
		List<RcmdMenuView> rcmdMenuList = rcmdMenuService.getViewListMenuId(id);
		
		String categoryName = categoryService.getNameById(menu.getCategoryId());
		
		
		model.addAttribute("categoryName", categoryName);
		model.addAttribute("menu", menu);
		model.addAttribute("rcmdMenuList", rcmdMenuList);
		
		
		return "menu/detail";
	}
}
