package org.tutorialspoint.dp1.prototype;

import java.io.Serializable;

public interface Prototype extends Cloneable, Serializable {
	void setPerson(Person person);
	String getPersonName();
	Object clone();
	Object deepClone();
}
