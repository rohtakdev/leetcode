package com.poorak.String;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RomanIntegerTest {
	private RomanInteger romanInteger = new RomanInteger();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		assertEquals(21, romanInteger.romanToInt("XXI")); 
		assertEquals(19, romanInteger.romanToInt("XIX")); 
		assertEquals(6, romanInteger.romanToInt("VI")); 
		assertEquals(4, romanInteger.romanToInt("IV")); 
		assertEquals(71, romanInteger.romanToInt("LXXI")); 
		assertEquals(82, romanInteger.romanToInt("LXXXII")); 
		assertEquals(93, romanInteger.romanToInt("XCIII")); 
		assertEquals(99, romanInteger.romanToInt("XCIX")); 
		assertEquals(707, romanInteger.romanToInt("DCCVII")); 
		assertEquals(1800, romanInteger.romanToInt("MDCCC")); 
	}

}
