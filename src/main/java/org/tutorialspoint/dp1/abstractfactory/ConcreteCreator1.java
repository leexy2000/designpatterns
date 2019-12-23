package org.tutorialspoint.dp1.abstractfactory;

public class ConcreteCreator1 implements Creator {

	@Override
	public ProductA factoryA() {
		return new ProductA1();
	}

	@Override
	public ProductB factoryB() {
		return new ProductB1();
	}

}
