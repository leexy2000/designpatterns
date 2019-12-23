package org.tutorialspoint.dp1.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run() {
		Person person = new Person();
		person.setName("Tomson");
		Prototype source = new ConcretePrototype();
		source.setPerson(person);
		Prototype target1 = (Prototype) source.clone();
		Prototype target2 = (Prototype) source.deepClone();
		person.setName("Jackson");
		logger.info("The Name of person in source is: " + source.getPersonName());
		logger.info("The Name of person cloned is: " + target1.getPersonName());
		logger.info("The Name of person in deepcloned is: " + target2.getPersonName());
	}

	public void freeze(String filename) {
		Person person = new Person();
		person.setName("Alibaba");
		ConcretePrototype.serialize(person, filename);
		Person other = (Person) ConcretePrototype.deserialize(filename);
		logger.info("The Name of person frozen is: " + other.getName());
	}
}
