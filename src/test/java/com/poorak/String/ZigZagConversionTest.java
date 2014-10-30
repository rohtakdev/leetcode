package com.poorak.String;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.String.ZigZagConversion;

public class ZigZagConversionTest {
	
	private ZigZagConversion zigZagConversion = new ZigZagConversion();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testConvert2row() {
		String s ="ABC";
		assertEquals("ACB",zigZagConversion.convert2(s, 2));
		
	}
	@Test
	public final void testConvert3row() {
		
		String q ="PAYPALISHIRING";
		assertEquals("PAHNAPLSIIGYIR",zigZagConversion.convert2(q, 3));
		
		
	}

}
