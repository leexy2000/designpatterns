package org.tutorialspoint.dp1.simplefactory;

public class Creator {

	/*
	 * 静态工厂方法
	 */
	public static Product factory(String id) {
		Product product = null;
		switch (id) {
		case "1":
			product = new ConcreteProduct1();
			break;
		case "2":
			product = new ConcreteProduct2();
			break;
		default:
			break;
		}
		return product;
	}
}
