package com.poorak.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidPalindromeTest {

	ValidPalindrome validPalindrome = new ValidPalindrome();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		String s = "A man, a plan, a canal: Panama";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testOK() {
		String s = "A r;o]]][[[[ra";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testOKAA() {
		String s = "aa";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testOKA() {
		String s = "a";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testOKEmpty() {
		String s = "";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testOKSpace() {
		String s = " ";
		assertTrue(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testFail() {
		String s = "poorak";
		assertFalse(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testFailEpic() {
		String s = "aa    aa    aa     aa    aa    aa     ac";
		assertFalse(validPalindrome.isPalindrome(s));
	}
	@Test
	public final void testFailEpic2() {
		String s = ".xcvmbnaskdlcfhlbaisgigf1234567890-=346990=0-=87435123";
		assertFalse(validPalindrome.isPalindrome(s));
	}

}
