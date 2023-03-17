package kr.co.rland.web.entity;

import java.util.Date;

public class MenuView extends Menu{
	
	private String categoryName;
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	

	public MenuView() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public MenuView(long id, String name, Integer price, String img, Date regDate, Integer categoryId,
			long regMemberId, String categoryName) {
		super(id, name, price, img, regDate, categoryId, regMemberId);
		this.categoryName = categoryName;
		// TODO Auto-generated constructor stub
	}

	public MenuView(String name, Integer price, String img, Integer categoryId, long regMemberId, String categoryName) {
		super(name, price, img, categoryId, regMemberId);
		this.categoryName = categoryName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MenuView [categoryName=" + categoryName + ", getCategoryName()=" + getCategoryName() + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getImg()=" + getImg()
				+ ", getRegDate()=" + getRegDate() + ", getCategoryId()=" + getCategoryId() + ", getRegMemberId()="
				+ getRegMemberId() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}

