package kr.co.rland.web.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;

@RestController("ApiMenuController")
@RequestMapping("menus")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	@GetMapping
	public List<MenuView> getList(
			@RequestParam(name="p", defaultValue = "1") int page,
			@RequestParam(name="c", required = false) Integer categoryId,
			@RequestParam(name="q", required = false) String query){
		
		List<MenuView> menu = service.getViewList(page, categoryId, query);
		
		return menu;
	}
	
	@GetMapping("{id}")
	public Menu get(@PathVariable("id") int id){
		//@PathParam 쿼리 variable은 값
		
		Menu menu = service.getById(id);
		
		return menu;
	}
	
	@PutMapping
	public String edit(@PathVariable("id") int id){
		
		return "menu edit " + id;
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable("id") int id){
		
		return "menu del " + id;
	}
	
	@PostMapping
	public String insert(@RequestBody Menu menu){
		System.out.println(menu.getName());
		System.out.println(menu.getPrice());
		
		return "menu insert " + menu.getName() + menu.getPrice();
	}
}
