package org.tutorialspoint.dp1.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		Creator creator1 = new ConcreteCreator1();
		Creator creator2 = new ConcreteCreator2();
		Product product1 = creator1.factory();
		Product product2 = creator2.factory();

		logger.info(product1.getClass().getName());
		logger.info(product2.getClass().getName());
	}
}
