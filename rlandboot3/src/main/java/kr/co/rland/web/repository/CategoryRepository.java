package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Category;
import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;

@Mapper
public interface CategoryRepository {
//	@Select("select * from menu")
//	List<Menu> findAll();
	List<Category> findAll();
	Category findById(int id);
	Menu insert(Category category);
	int update(Category category);
	void delete(int id);


}
	
