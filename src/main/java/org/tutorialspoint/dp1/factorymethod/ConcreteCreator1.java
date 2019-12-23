package org.tutorialspoint.dp1.factorymethod;

public class ConcreteCreator1 implements Creator {

	@Override
	public Product factory() {
		return new ConcreteProduct1();
	}

}
