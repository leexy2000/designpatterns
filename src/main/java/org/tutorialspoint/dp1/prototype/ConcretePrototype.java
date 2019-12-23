package org.tutorialspoint.dp1.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class ConcretePrototype implements Prototype {

	private Person person = null;

	@Override
	public Object clone() {
		Object target = null;
		try {
			target = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return target;
	}

	@Override
	public Object deepClone() {
		Object target = null;

		// write object to stream
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = null;
		try {
			oo = new ObjectOutputStream(bo);
			oo.writeObject(this);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// read object from stream
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		try {
			ObjectInputStream oi = new ObjectInputStream(bi);
			target = oi.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return target;
	}

	@Override
	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String getPersonName() {
		return person.getName();
	}

	public static void serialize(Object obj, String filename) {
		try {
			FileOutputStream fileStream = new FileOutputStream(filename);
			ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
			objectStream.writeObject(obj);
			objectStream.flush();
			objectStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object deserialize(String filename) {
		Object obj = null;
		try {
			FileInputStream fileStream = new FileInputStream(filename);
			ObjectInputStream objectStream = new ObjectInputStream(fileStream);
			obj = objectStream.readObject();
			objectStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
