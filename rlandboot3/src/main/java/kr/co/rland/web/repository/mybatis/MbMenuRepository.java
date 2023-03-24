package kr.co.rland.web.repository.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.repository.MenuRepository;
//interface overload 설정을 테스트, (@Mapper 미 사용)
//@Repository
public class MbMenuRepository implements MenuRepository {
	
//	@Autowired
	private SqlSession session;
	private MenuRepository repository;
	
	
	@Autowired
	public MbMenuRepository(SqlSession session) {
		super();
		this.session = session;
		this.repository = session.getMapper(MenuRepository.class);
	}

	@Override
	public List<Menu> findAll() {
//		MenuRepository menuDao = session.getMapper(MenuRepository.class);
//		session.selectList("kr.co.rland.web.repository.MenuRepository.findAll");
		return repository.findAll(0,10,null, null, null, null, null);
		
	}
	@Override
	public List<Menu> findAll(Integer offset, Integer size, String query, Integer price, Integer categoryId,
			String orderField, String orderDir) {
		return repository.findAll(offset, size, query, categoryId, price, orderField, orderDir);
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
	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}


	@Override
	public List<Menu> findAllById(List<Long> ids) {
		return null;
//		MenuRepository repository = session.getMapper(MenuRepository.class);
//		List<Menu> repository = session.selectList("kr.co.rland.web.repository.MenuRepository");
//		return repository.findAllById(ids);
	}

	@Override
	public List<Menu> findAllById(long ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findAllByIds(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String query, Integer categoryId, Integer price) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MenuView> findViewAll(Integer offset, Integer size, String query, Integer categoryId, Integer price,
			String orderField, String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
