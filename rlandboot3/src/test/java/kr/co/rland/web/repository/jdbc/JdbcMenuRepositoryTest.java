package kr.co.rland.web.repository.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.Connection;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

class JdbcMenuRepositoryTest {

	@Test
	void testFindAll() throws SQLException {
		MenuRepository repo = new JdbcMenuRepository();
		List<Menu> list = repo.findAll();
		System.out.println(list.size());
		
	}
	

		@Test
		public void testConn() throws ClassNotFoundException, SQLException{
		
//			
			String DRIVER = "org.mariadb.jdbc.Driver";	
			String URL = "jdbc:mariadb://db.newlecture.com:3306/DiaryPrj";
			String USER = "dailynovel";
			String PWD = "newlec486";
			
//			String URL = "jdbc:mariadb://db.newlecture.com:3306/busdb";
//			String USER = "bus";
//			String PWD = "bus123";
			
			Class.forName(DRIVER);
			Connection conn = (Connection)DriverManager.getConnection(URL, USER, PWD);
			System.out.println(conn);

	}

}
