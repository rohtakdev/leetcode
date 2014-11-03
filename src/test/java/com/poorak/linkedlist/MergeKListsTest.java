package com.poorak.linkedlist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class MergeKListsTest {
private MergeKLists mergeKLists=new MergeKLists();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testMerge() {
		ListNode l1 = ListUtilities.create(1);
		ListNode l2 = ListUtilities.create(0);
		
		ListNode expected = ListUtilities.create(0,1);
		
		
		ListNode actual = mergeKLists.mergeKLists(new ArrayList<ListNode>(){{add(l1); add(l2);}}); 
		
	
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}

}
