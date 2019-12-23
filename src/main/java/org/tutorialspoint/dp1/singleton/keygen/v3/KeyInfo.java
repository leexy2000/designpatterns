package org.tutorialspoint.dp1.singleton.keygen.v3;

public class KeyInfo {
	private int keyMax;
	private int keyMin;
	private int nextKey;
	private int poolSize;

	public KeyInfo(int poolSize) {
		this.poolSize = poolSize;
		retrieveFromDB();
	}

	public int getKeyMax() {
		return keyMax;
	}

	public int getKeyMin() {
		return keyMin;
	}

	public int getNextKey() {
		if (nextKey > keyMax) {
			retrieveFromDB();
		}
		return nextKey++;
	}

	@SuppressWarnings("unused")
	private void retrieveFromDB() {
		String sql1 = "UPDATE keyTable SET keyValue = keyValue+" 
				+ poolSize + "WHERE keyName='PO_NUMBER'";
		String sql2 = "SELECT keyName From keyTable WHERE keyName='PO_NUMBER";
		// execute the above queries in a transaction and commit it
		// assume the value returned is 1000
		// 示意性返回一个数值
		int keyFromDB = 1000;
		keyMin = keyFromDB;
		keyMax = keyFromDB + poolSize - 1;
		nextKey = keyMin;
	}

}
