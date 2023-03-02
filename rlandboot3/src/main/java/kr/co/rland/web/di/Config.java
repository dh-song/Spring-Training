package kr.co.rland.web.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.rland.web.repository.jdbc.JdbcMenuRepository;

@Configuration
public class Config {
	
//	@Bean
//	public JdbcMenuRepository repository(){
//		return new JdbcMenuRepository();
//	}
	
	@Bean
	public String hello() {
		return "안녕~";
	}
}
