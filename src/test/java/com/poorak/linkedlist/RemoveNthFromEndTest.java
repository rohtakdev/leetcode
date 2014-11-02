package com.poorak.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class RemoveNthFromEndTest {

	private RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testOK() {
		
		ListNode l = ListUtilities.create(1,2,3,4,5);
		ListNode expected = ListUtilities.create(1,2,3,5);
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = removeNthFromEnd.removeNthFromEnd(l, 2); 
		
	
		System.out.println(String.format("Actual=%s", actual));
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}
	@Test
	public final void testSmallOK() {
		
		ListNode l = ListUtilities.create(1,2,3,4,5,6,7);
		ListNode expected = ListUtilities.create(2,3,4,5,6,7);
	
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = removeNthFromEnd.removeNthFromEnd(l, 7); 
		
	
		System.out.println(String.format("Actual=%s", actual));
		
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}
	@Test
	public final void testLargeFail() {
		
		ListNode l = ListUtilities.create(1,2,3,4,5,6,7);
		ListNode expected = ListUtilities.create(1,2,3,4,5,6,7);
		
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = removeNthFromEnd.removeNthFromEnd(l, 8); 
		
		
		System.out.println(String.format("Actual=%s", actual));
		
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}
	
	
}
