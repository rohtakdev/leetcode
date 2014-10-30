package com.poorak.String;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.String.Atoi;

public class AtoiTest {
	private Atoi atoi = new Atoi();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testAtoiOK() {
		assertEquals(23, atoi.atoi("23"));
	}
	@Test
	public final void testAtoiPlusOK() {
		assertEquals(23, atoi.atoi("+23"));
	}
	@Test
	public final void testAtoiSpaceFail() {
		assertEquals(0, atoi.atoi("     "));
	}
	@Test
	public final void testAtoiDigitSpaceOK() {
		assertEquals(23, atoi.atoi("   23               "));
	}
	@Test
	public final void testAtoiIntMaxOK() {
		assertEquals(Integer.MAX_VALUE, atoi.atoi(""+Integer.MAX_VALUE));
	}
	@Test
	public final void testAtoiIntMaxFail() {
		assertEquals(Integer.MAX_VALUE, atoi.atoi("2147483699"));
	}
	@Test
	public final void testAtoiIntMinOK() {
		assertEquals(Integer.MIN_VALUE, atoi.atoi("-2147483648"));
	}
	@Test
	public final void testAtoiIntMinFail() {
		assertEquals(Integer.MIN_VALUE, atoi.atoi("-2147483666"));
	}
	@Test
	public final void testAtoiWrongOK() {
		assertEquals(-12, atoi.atoi("  -0012a42"));
	}
	@Test
	public final void testAtoiLongFail() {
		assertEquals(Integer.MAX_VALUE, atoi.atoi("    10522545459"));
	}

}
