package com.poorak.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class SortTest {
private Sort sort =new Sort();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testSortList() {
		ListNode head = ListUtilities.create(2,1,4,3);
		ListNode expected = ListUtilities.create(1,2,3,4);
		assertTrue(ListUtilities.equals(expected, sort.sortList(head)));
	}

}
