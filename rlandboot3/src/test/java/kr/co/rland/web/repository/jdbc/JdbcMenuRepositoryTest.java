package kr.co.rland.web.repository.jdbc;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

class JdbcMenuRepositoryTest {

	@Test
	void testFindAll() throws SQLException {
		MenuRepository repo = new JdbcMenuRepository();
		List<Menu> list = repo.findAll();
		System.out.println(list.size());
		
	}

}
