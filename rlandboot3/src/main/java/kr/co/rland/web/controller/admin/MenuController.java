package kr.co.rland.web.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Controller("adminMenuController")
@RequestMapping("/admin/menu/")
public class MenuController {
	
	@Autowired
	private MenuService service;
	

//	public MenuController(MenuRepository menuRepository) {
//		super();
//		this.menuRepository = menuRepository;
//	}
//	
//	@Autowired
//	public void setMenuRepository(MenuRepository menuRepository) {
//		this.menuRepository = menuRepository;
//	}


	@GetMapping("list")
	public String list(Model model,
			@RequestParam(name = "p", defaultValue = "1")int page,
			@RequestParam(name = "c", required = false) Integer categoryId,
			@RequestParam(name = "q", required = false) String query,
			HttpServletRequest req
			) throws UnsupportedEncodingException {
		
		List<MenuView> list = service.getViewList(page, categoryId, query);
		model.addAttribute("list",list);
		return "admin/menu/list";
		
//		System.out.println(page);
//		System.out.println(q);
		
		
//		------------------------쿠키
//		String myCookie = "";
//		Cookie[] cookies = req.getCookies();
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals("my")) {
//				myCookie = cookie.getValue();
//				break;
//			}
//		}
//		
//		myCookie = URLDecoder.decode(myCookie, "utf-8");
//		
//		System.out.println(service.getClass());
//		List<Menu> list = service.getList();
//		model.addAllAttributes(list);
//		System.out.println(list);
//		
//		System.out.println(myCookie);
	
	}
	
	@GetMapping("detail")
	public String detail() {
		return null;
	}
	
	@GetMapping("reg")
	public String reg() {
		return "admin/menu/reg";
	}
	
	@PostMapping("reg")
	public String reg(String str) {

		
		System.out.println("매뉴 등록 완료");
		return "redirect:list";
	}
}
