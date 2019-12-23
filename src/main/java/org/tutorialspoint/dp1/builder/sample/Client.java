package org.tutorialspoint.dp1.builder.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tutorialspoint.dp1.builder.sample.Person;

public class Client {
	private Logger logger = LoggerFactory.getLogger(Client.class);

	public void run(String name, String id, Person.Sex gender) {
		Person.PersonBuilder builder = new Person.PersonBuilder();
		Person person = builder
				.buildName(name)
				.buildId(id)
				.buildGender(gender)
				.build();

		logger.info(person.toString());
	}

}
