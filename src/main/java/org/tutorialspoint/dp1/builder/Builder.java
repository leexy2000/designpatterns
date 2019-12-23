package org.tutorialspoint.dp1.builder;

public abstract class Builder {

	/**
	 * 产品返还方法
	 */
	public abstract Product build();

	/**
	 * 产品零件建造方法
	 */

	public abstract void buildPart1();

	/**
	 * 产品零件建造方法
	 */
	public abstract void buildPart2();
}
