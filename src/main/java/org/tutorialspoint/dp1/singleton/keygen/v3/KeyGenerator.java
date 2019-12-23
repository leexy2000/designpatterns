package org.tutorialspoint.dp1.singleton.keygen.v3;

/**
 * 方案3：键值缓存的方案
 *
 */
public class KeyGenerator {
	private static KeyGenerator keygen = new KeyGenerator();
	private static final int POOL_SIZE = 20;
	private KeyInfo key;

	/**
	 * 私有构造子，保证外界无法初始化
	 */
	private KeyGenerator() {
		key = new KeyInfo(POOL_SIZE);
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
		return key.getNextKey();
	}

}
