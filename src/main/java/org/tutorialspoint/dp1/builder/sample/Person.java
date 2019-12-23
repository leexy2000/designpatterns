package org.tutorialspoint.dp1.builder.sample;

public class Person {
	private String name;
	private Sex gender;
	private String id;

	public enum Sex {
		MALE, FEMALE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(Sex gender) {
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return name + ", " + ((gender == Sex.MALE) ? "his" : "her") + " ID is " + id;
	}

	public static class PersonBuilder {
		private Person person = new Person();

		public PersonBuilder buildName(String name) {
			person.setName(name);
			return this;
		}

		public PersonBuilder buildId(String id) {
			person.setId(id);
			return this;
		}

		public PersonBuilder buildGender(Sex gender) {
			person.setGender(gender);
			return this;
		}

		public Person build() {
			return person;
		}
	}
}
