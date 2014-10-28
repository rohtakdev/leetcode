package com.poorak.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidParenthesisTest {
	
	private ValidParenthesis validParenthesis;

	@Before
	public void setUp() throws Exception {
		validParenthesis = new ValidParenthesis();
	}

	@Test
	public final void testIsValid() {
		String s ="()";
		
		assertTrue(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFail() {
		String s ="(]([)]";
		
		assertFalse(validParenthesis.isValid(s));
	}
	
	@Test
	public final void testIsValidPass() {
		String s ="()[]{}";
		
		assertTrue(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFail2() {
		String s ="]";
		
		assertFalse(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFail3() {
		String s ="([])";
		
		assertTrue(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFailLong() {
		String s =")}{({))[{{[}";
		
		assertFalse(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFailVeryLong() {
		String s =")}{({))[{{[})}{({))[{{[})}{({))[{{[})}{({))[{{[}";
		
		assertFalse(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFailSameLong() {
		String s ="{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{";
		
		assertFalse(validParenthesis.isValid(s));
	}
	@Test
	public final void testIsValidFailSmal() {
		String s ="]";
		
		assertFalse(validParenthesis.isValid(s));
	}

}
