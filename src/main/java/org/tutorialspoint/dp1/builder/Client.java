package org.tutorialspoint.dp1.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		Director director = new Director();
		logger.info(director.build().getClass().getName());
	}
}
