package com.poorak.String;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.String.ValidNumber;

public class ValidNumberTest {

	private ValidNumber validNumber = new ValidNumber();
	@Before
	public void setUp() throws Exception {
	} 

	@Test
	public final void test01() {
		String s = "0.1";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test0() {
		String s = "0";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testabc() {
		String s = "abc";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void test1a() {
		String s = "1 a";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void test2e10() {
		String s = "2e10";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testee10() {
		String s = "ee10";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void test2e1e() {
		String s = "2e1e";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void test2dot10() {
		String s = "2.10";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test1space() {
		String s = "1 ";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testspace() {
		String s = " ";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void test2space() {
		String s = "1  ";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test1frontspace() {
		String s = " 1  ";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test2frontspace() {
		String s = "    1 5  6 ";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void testdot1() {
		String s = ".1";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test1dot() {
		String s = "1.";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testminus1() {
		String s = "-1";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testminusdot1() {
		String s = "-.1";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void testplus1() {
		String s = "+.8";
		assertTrue(validNumber.isNumber(s));
	}
	@Test
	public final void test0e() {
		String s = "0e";
		assertFalse(validNumber.isNumber(s));
	}
	@Test
	public final void testDot() {
		String s = ".";
		assertFalse(validNumber.isNumber(s));
	}

}
