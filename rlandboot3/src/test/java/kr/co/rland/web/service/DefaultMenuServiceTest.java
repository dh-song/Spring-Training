package kr.co.rland.web.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DefaultMenuServiceTest {
	
	@Autowired
	private MenuService service;
	
	@Test
	void testPointUp() {
		service.pointUp();
		System.out.println("완료");
	}

}
