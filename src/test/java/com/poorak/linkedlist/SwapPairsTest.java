package com.poorak.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class SwapPairsTest {
	private SwapPairs swapPairs = new SwapPairs();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testSwapPairs() {
		ListNode head = ListUtilities.create(1,2,3,4);
		ListNode expected = ListUtilities.create(2,1,4,3);
		
		assertTrue(ListUtilities.equals(expected, swapPairs.swapPairs(head)));
	}

}
