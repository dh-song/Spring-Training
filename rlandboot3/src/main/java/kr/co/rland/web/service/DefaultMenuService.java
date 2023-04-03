package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;
@Service
public class DefaultMenuService implements MenuService{
	
	@Autowired
	private MenuRepository repository;

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll(0,10,"",1,3000,"reg_date","desc");
	}

	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}
	
	@Transactional
	@Override
	public void pointUp() {
		Menu menu = new Menu();
		menu.setId(797);
		menu.setPrice(1000);
		repository.update(menu);
		
		menu.setId(797);
		menu.setPrice(30000);
		repository.update(menu);
		
	}

	@Override
	public List<MenuView> getViewList(int page) {
		
		int size=10;
		int offset = (page-1)*10;
		List<MenuView> list = repository.findViewAll( offset, size, null, null, null, null, null);
		return list;
	}

	@Override
	public List<MenuView> getViewList(int page, Integer categoryId) {
		
		int size=10;
		int offset = (page-1)*10;
		List<MenuView> list = repository.findViewAll(offset, size, null, categoryId, null, null, null);
		return list;
	}

	@Override
	public List<MenuView> getViewList(int page, String query) {
		
		int size=10;
		int offset = (page-1)*10;
		List<MenuView> list = repository.findViewAll(offset, size, query, null, null, null, null);
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public List<MenuView> getViewList(int page, Integer categoryId, String query) {
		
		int size=10;
		int offset = (page-1)*10;
		List<MenuView> list = repository.findViewAll(offset, size, query, categoryId, null, null, null);
		return list;
	}

	@Override
	public Menu getById(long id) {
		Menu menu = repository.findById(id);
		return menu;
	}

	@Override
	public String add(Menu menu) {
		String a = "ok";
		int result = repository.insert(menu);
		if (result !=1) {
			a = "false";
		}
		return a;

	}
	
	
}
