package org.tutorialspoint.dp1.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {

		Product product1 = Creator.factory("1");
		Product product2 = Creator.factory("2");
		logger.info(product1.getClass().getName());
		logger.info(product2.getClass().getName());
	}
}
