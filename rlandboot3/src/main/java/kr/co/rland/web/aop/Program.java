package kr.co.rland.web.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {
	public static void main(String[] args) {
		Calculator cal = new DefaultCalculator(3,4);
		
		Calculator prx = (Calculator) Proxy.newProxyInstance(
				DefaultCalculator.class.getClassLoader()
				, new Class[] {Calculator.class}
				,
//				new InvocationHandler() {
				(Object proxy, Method method, Object[] ags)->{
				System.out.printf("호출 메서드: %s\n" ,method.getName());
				System.out.printf("호출 전: %s\n" ,method.getName());
				Object result = method.invoke(cal, ags);
				System.out.printf("결과: %d\n", result);
				System.out.printf("호출 후: %s\n" ,method.getName());
//					
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						// TODO Auto-generated method stub
//						return null;
//					}
					return result;
				}); 
		int result = 0;
		
		result = cal.plus();
		System.out.printf("plus : %d\n", result);
		result = cal.sub();
		System.out.printf("sub : %d\n", result);
		result = cal.multi();
		System.out.printf("multi : %d\n", result);
	}
}
