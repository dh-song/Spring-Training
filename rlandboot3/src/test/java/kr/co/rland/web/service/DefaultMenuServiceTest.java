package kr.co.rland.web.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.rland.web.entity.Menu;

@SpringBootTest
@AutoConfigureMybatis
class DefaultMenuServiceTest {
	
	@Autowired
	private MenuService service;
	
	@Autowired
	private CategoryService cService;
	
	@Test
	void testPointUp() {
//		service.pointUp();
//		List<MenuView> list = service.getViewList(1);
//		System.out.println(list);
		List<Menu> menus = service.getList();
		System.out.println(menus);
		Menu menu = service.getById(617L);
		System.out.println(menu);
		System.out.println("완료");
		String categoryName = cService.getNameById(1);
		System.out.println(categoryName);
	}

}
