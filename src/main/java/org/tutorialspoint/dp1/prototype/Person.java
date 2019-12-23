package org.tutorialspoint.dp1.prototype;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
