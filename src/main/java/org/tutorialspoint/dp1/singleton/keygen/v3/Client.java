package org.tutorialspoint.dp1.singleton.keygen.v3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		KeyGenerator keygen = KeyGenerator.getInstance();
		for (int i = 0; i < 26; i++) {
			logger.info("key(" + (i + 1) + ")=" + keygen.getNextKey());
		}
	}
}