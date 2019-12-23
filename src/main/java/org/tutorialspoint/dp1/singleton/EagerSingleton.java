package org.tutorialspoint.dp1.singleton;

public class EagerSingleton {
	private static final EagerSingleton me = new EagerSingleton();

	/*
	 * 私有的默认构造子
	 */
	private EagerSingleton() {
	}

	/*
	 * 静态工厂方法
	 */
	public static EagerSingleton getInstance() {
		return me;
	}
}
