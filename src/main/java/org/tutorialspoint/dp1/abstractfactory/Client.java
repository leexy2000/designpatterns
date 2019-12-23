package org.tutorialspoint.dp1.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		Creator creator1 = new ConcreteCreator1();
		Creator creator2 = new ConcreteCreator2();
		ProductA productA1 = creator1.factoryA();
		ProductA productA2 = creator2.factoryA();
		ProductB productB1 = creator1.factoryB();
		ProductB productB2 = creator2.factoryB();

		logger.info(productA1.getClass().getName());
		logger.info(productA2.getClass().getName());
		logger.info(productB1.getClass().getName());
		logger.info(productB2.getClass().getName());
	}
}

