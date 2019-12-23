package org.tutorialspoint.dp1.singleton;

public class LazySingleton {
	private static LazySingleton me = null;

	/*
	 * 私有的默认构造子
	 */
	private LazySingleton() {
	}

	/*
	 * 静态工厂方法，返回此类的唯一实例
	 */
	synchronized public static LazySingleton getInstance() {
		if (me == null) {
			me = new LazySingleton();
		}
		return me;
	}
}
