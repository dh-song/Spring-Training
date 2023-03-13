package kr.co.rland.web.aop;

public class DefaultCalculator implements Calculator {

	private int x;
	private int y;
	
	public DefaultCalculator() {
	}
	
	public DefaultCalculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int plus() {
		// TODO Auto-generated method stub
		int result = this.x+this.y;
		return result;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		int result = x-y;
		return result;
	}

	@Override
	public int multi() {
		// TODO Auto-generated method stub
		int result = x*y;
		return result;
	}

	@Override
	public String toString() {
		return "DefaultCalculator [x=" + x + ", y=" + y + ", plus()=" + plus() + ", sub()=" + sub() + ", multi()="
				+ multi() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
