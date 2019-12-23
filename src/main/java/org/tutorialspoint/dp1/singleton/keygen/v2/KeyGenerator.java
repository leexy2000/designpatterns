package org.tutorialspoint.dp1.singleton.keygen.v2;

/**
 * 方案2：有数据库的情况
 *
 */
public class KeyGenerator {
	private static KeyGenerator keygen = new KeyGenerator();
	
	/**
	 * 私有构造子，保证外界无法初始化
	 */
	private KeyGenerator() {
	}

	/**
	 * 静态工厂方法，提供自己的实例
	 */
	public static KeyGenerator getInstance() {
		return keygen;
	}

	/**
	 * 取值方法，取得下一个合适的键值
	 */
	public synchronized int getNextKey() {
		return getNextKeyFromDB();
	}

	/**
	 * 访问数据库取得键值的方法
	 */
	private int getNextKeyFromDB() {
		// 示意性返回一个数值
		return 1000;
	}

}
