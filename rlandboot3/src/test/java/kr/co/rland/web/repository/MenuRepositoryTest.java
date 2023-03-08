package kr.co.rland.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import kr.co.rland.web.entity.Menu;

@AutoConfigureTestDatabase(replace=Replace.NONE)
@MybatisTest
class MenuRepositoryTest {

	@Autowired
	private MenuRepository repository;
	
	@Test
	void testFindAll() {
	List<Menu> list = repository.findAll(0, 10, null, null, null, "regDate", "desc");
	System.out.println(list);
	}
	
	@Test
	void testFindAllById() {
		List<Long> ids = new ArrayList<>();
		ids.add(616L);
		ids.add(617L);
		ids.add(713L);
		ids.add(737L);
	List<Menu> list = repository.findAllById(ids);
	System.out.println(list);
	}

	@Test
	void testUpdate() {
		Menu menu = new Menu();
		menu.setName("hi");
		menu.setPrice(3000);
		menu.setId(745);
		int result = repository.update(menu);
		System.out.println(result);
	}

}
