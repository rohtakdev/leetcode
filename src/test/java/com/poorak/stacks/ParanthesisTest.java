package com.poorak.stacks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParanthesisTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		assertTrue(new Paranthesis().isValid("(){}[]"));
		assertFalse(new Paranthesis().isValid("){}[]"));
	}

}
