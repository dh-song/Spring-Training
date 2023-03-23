package kr.co.rland.web.service;

import java.util.List;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

public interface MenuService {
	List<Menu> getList();
	void pointUp();
	List<MenuView> getViewList(int page);
	List<MenuView> getViewList(int page, Integer categoryId);
	List<MenuView> getViewList(int page, String query);
	List<MenuView> getViewList(int page, Integer categoryId, String query);
	Menu getById(long id);
	
}
