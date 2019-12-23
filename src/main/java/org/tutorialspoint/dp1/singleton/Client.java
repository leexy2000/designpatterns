package org.tutorialspoint.dp1.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		LazySingleton obj = LazySingleton.getInstance();
		logger.info(obj.getClass().getName());
	}
}
