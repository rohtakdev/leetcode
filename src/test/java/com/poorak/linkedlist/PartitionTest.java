package com.poorak.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class PartitionTest {
	private Partition partition = new Partition();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void test() {
		ListNode head = ListUtilities.create(2,1,3);
		ListNode expected = ListUtilities.create(1,2,3);
		
		ListNode actual = partition.partition(head, 2);
		
		assertTrue(ListUtilities.equals(expected, actual));
	}

}
