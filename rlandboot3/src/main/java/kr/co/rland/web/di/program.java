package kr.co.rland.web.di;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("kr/co/rland/web/di/context.xml");
		
//		MenuRepository menuRepository =  context.getBean(MenuRepository.class);
//		List<Menu> list = menuRepository.findAll();
		MenuService service = context.getBean(MenuService.class);
		List<Menu> list = service.getList();
		System.out.println(list);
	}

}
