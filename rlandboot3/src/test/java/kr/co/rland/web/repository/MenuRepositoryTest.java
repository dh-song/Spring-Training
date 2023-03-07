package kr.co.rland.web.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
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
	void testUpdate() {
		Menu menu = new Menu();
		menu.setName("hilll");
		menu.setPrice(2000);
		menu.setId(745);
		Menu m = repository.update(menu);
		System.out.println(m);
	}

}
