package org.tutorialspoint.dp1.singleton.keygen.v1;

/**
 * 方案1：没有数据库的情况
 *
 */
public class KeyGenerator {
	private static KeyGenerator keygen = new KeyGenerator();
	private int key = 1000;

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
		return key++;
	}

}
