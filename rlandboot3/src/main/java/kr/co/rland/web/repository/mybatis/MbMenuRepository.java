package kr.co.rland.web.repository.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@Repository
public class MbMenuRepository implements MenuRepository {
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<Menu> findAll() {
		MenuRepository menuDao = session.getMapper(MenuRepository.class);
		return menuDao.findAll();
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu insert(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu update(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Menu> findAll(Integer offset, Integer size, String query, Integer price, Integer categoryId,
			String orderField, String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}

}
