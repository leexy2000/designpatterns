package org.tutorialspoint.dp1.builder;

public class Director {

	private Builder builder;

	public Product build() {
		builder = new ConcreteBuilder();
		builder.buildPart1();
		builder.buildPart2();
		return builder.build();
	}
}
