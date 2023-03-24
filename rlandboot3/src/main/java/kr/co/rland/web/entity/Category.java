package kr.co.rland.web.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
	private int id;
	private String name;
	
	
	
//	public Category() {
//		super();
//	}
//	
//	public Category(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	
//	@Override
//	public String toString() {
//		return "Category [id=" + id + ", name=" + name + "]";
//	}
//	
//	
	
}
