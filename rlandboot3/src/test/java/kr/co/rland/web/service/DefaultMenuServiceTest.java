package kr.co.rland.web.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

@SpringBootTest
@AutoConfigureMybatis
class DefaultMenuServiceTest {
	
	@Autowired
	private MenuService service;
	
	@Test
	void testPointUp() {
//		service.pointUp();
//		List<MenuView> list = service.getViewList(1);
//		System.out.println(list);
		Menu menu = service.getById(617L);
		System.out.println(menu);
		System.out.println("완료");
	}

}
