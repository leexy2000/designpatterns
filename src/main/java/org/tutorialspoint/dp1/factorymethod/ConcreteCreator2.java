package org.tutorialspoint.dp1.factorymethod;

public class ConcreteCreator2 implements Creator {

	@Override
	public Product factory() {
		return new ConcreteProduct2();
	}

}
