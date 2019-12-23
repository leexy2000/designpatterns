package org.tutorialspoint.dp1.abstractfactory;

public class ConcreteCreator2 implements Creator {

	@Override
	public ProductA factoryA() {
		return new ProductA2();
	}

	@Override
	public ProductB factoryB() {
		return new ProductB2();
	}

}
