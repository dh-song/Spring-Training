package kr.co.rland.web.di;

import java.security.Provider.Service;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.JSONParser;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

public class program {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("kr/co/rland/web/di/context.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		
		String hello = (String) context.getBean("hello");
		System.out.println(hello);		
////		MenuRepository menuRepository =  context.getBean(MenuRepository.class);
////		List<Menu> list = menuRepository.findAll();
////		MenuService service = context.getBean(MenuService.class);
//		MenuService service = (MenuService) context.getBean("service");//bean name으로 부르기
//		List<Menu> list = service.getList();
//		System.out.println(list);
		
		
		//어노테이션활용 방법
//		Menu menu = new Menu();
//		menu.setId(1);
//		menu.setName("아메리카노");
//		menu.setPrice(3000);
////		menu.setRegDate(new Date("2023-12-12"));
//		menu.setRegMemberId(11);
//		
//		JSONParser parser = new JSONParser(menu);
//		String json = parser.toJSON();
//		
//		System.out.println(json);
	}

}
