package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Menu;

//@Mapper
public interface MenuRepository {
//	@Select("select * from menu")
	List<Menu> findAll();
	List<Menu> findAll(
			Integer offset, Integer size, 
			String query, Integer categoryId, 
			Integer price, String orderField,
			String orderDir);
	List<Menu> findAllById(List<Long> ids);
	List<Menu> findAllById(long ids);
	Menu findById(long id);
	Menu insert(Menu menu);
	int update(Menu menu);
	void delete(long id);

}
	
