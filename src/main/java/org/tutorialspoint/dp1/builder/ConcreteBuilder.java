package org.tutorialspoint.dp1.builder;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();

	@Override
	public Product build() {
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
	}

}
