package kr.co.rland.web.repository.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

//@Repository
public class JdbcMenuRepository implements MenuRepository {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public List<Menu> findAll() {
		
		String sql = "select id, name, price, regDate, categoryId from menu";

		//프로퍼티에 정의 오토와이어드
//		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//		dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver");
//		dataSourceBuilder.url("jdbc:mariadb://db.newlecture.com:3306/rlanddb");
//		dataSourceBuilder.username("rland");
//		dataSourceBuilder.password("20220823");
//
//		DataSource dataSource = dataSourceBuilder.build();

		JdbcTemplate template = new JdbcTemplate(dataSource);		
		List<Menu> list = template.query(sql, new BeanPropertyRowMapper(Menu.class));
		
		return list;
		
//		@Override
//		public List<Menu> findAll() {
//			
//				String sql = String.format("select id, name, price, regdate, categoryid, regMemberid from menu;");
//				List<Menu> list = new ArrayList<>();
	//
//				try {
//					Class.forName("org.mariadb.jdbc.Driver");
//					String url = "jdbc:mariadb://db.newlecture.com:3306/rlanddb";
//					  Connection con = DriverManager.getConnection(url, "rland", "20220823");
	//
//					Statement st = con.createStatement();
//					ResultSet rs = st.executeQuery(sql);
	//
//					// 필터링, 집계, 정렬
//					while (rs.next()) // 서버의 커서를 한칸 내리고 그 위치의 레코드를 옮겨 오는 것. -> 레코드 하나가 저장되는 공간은?
//					{
//						Long id = rs.getLong("id");
//						String name = rs.getString("name");
//						int price = rs.getInt("price");
//						Date regDate = rs.getDate("regDate");
//						int categoryId = rs.getInt("categoryId");
//						long regMemberId = rs.getLong("regMemberId");
//						Menu menu = new Menu(id, name, price, regDate, categoryId, regMemberId);
//						list.add(menu);
//					}
//					con.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return list;
//		}
		
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
	public List<Menu> findAll(Integer offset, Integer size, String query, Integer price, Integer categoryId,
			String orderField, String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findAllById(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findAllById(long ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
