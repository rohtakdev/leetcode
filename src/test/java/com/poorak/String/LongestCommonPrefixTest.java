package com.poorak.String;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LongestCommonPrefixTest {
	
	private LongestCommonPrefix lcp= new LongestCommonPrefix();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		assertEquals("abc", lcp.longestCommonPrefix(new String[]{"abcdef", "abc238792365"}));
		assertEquals("a", lcp.longestCommonPrefix(new String[]{"a", "a"}));
		assertEquals("", lcp.longestCommonPrefix(new String[]{"", "b"}));
		assertEquals("", lcp.longestCommonPrefix(new String[]{}));
		assertEquals("a", lcp.longestCommonPrefix(new String[]{"a"}));
		
		assertEquals("Welcome To ", lcp.longestCommonPrefix(new String[]{"Welcome To India", "Welcome To USA"}));
		assertEquals("bbbbbbbbbbbbbbbbbb", lcp.longestCommonPrefix(new String[]{"aaaaaaccccccccccc", "bbbbbbbbbbbbbbbbbbaaaaaa", "bbbbbbbbbbbbbbbbbbddddd", "bbbbbbbbbcccccccccccccccc"}));
	}
	
	
	@Test
	public void testFail(){
		assertEquals("a", lcp.longestCommonPrefix(new String[]{"aa", "a"}));
	}

}
