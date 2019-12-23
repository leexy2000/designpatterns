package org.tutorialspoint.dp1.singleton.keygen.v1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class KeyGeneratorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetNextKey() {
		KeyGenerator keygen1 = KeyGenerator.getInstance();
		KeyGenerator keygen2 = KeyGenerator.getInstance();
		assertEquals(1000, keygen1.getNextKey());
		assertEquals(1001, keygen2.getNextKey());
	}

}
