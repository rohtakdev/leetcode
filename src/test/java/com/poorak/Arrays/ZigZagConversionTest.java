package com.poorak.Arrays;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ZigZagConversionTest {
	
	private ZigZagConversion zigZagConversion = new ZigZagConversion();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testConvert() {
		String s ="ABC";
		assertEquals("ACB",zigZagConversion.convert(s, 2));
	}

}
