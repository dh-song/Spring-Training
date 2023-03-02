package kr.co.rland.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
@Service
public class DefaultMenuService implements MenuService{
	
	private MenuRepository repository;

	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}
	
	
}
