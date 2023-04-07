package kr.co.rland.web.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.CrossOrigin;
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
import kr.co.rland.web.dto.MenuListData;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;

@RestController("ApiMenuController")
//@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("menus")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	
	@GetMapping
	public MenuListData getList(
			@RequestParam(name="p", defaultValue = "1") int page,
			@RequestParam(name="c", required = false) Integer categoryId,
			@RequestParam(name="q", required = false) String query){
		
		List<MenuView> list = service.getViewList(page, categoryId, query);
		List<MenuView> newMenuList = service.getViewList(page, categoryId, query);
		
		MenuListData data = new MenuListData(); //자료형 생성 말고 map 같은 컬렉션 사용도 방법
		data.setList(list);
		data.setNewMenuList(newMenuList);
		
		return data;
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
		menu.setCategoryId(1);
		String result = service.add(menu);
		return result;
	}
}
