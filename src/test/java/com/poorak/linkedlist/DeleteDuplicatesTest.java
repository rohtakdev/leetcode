package com.poorak.linkedlist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.poorak.listutilities.ListUtilities;

public class DeleteDuplicatesTest {
	private DeleteDuplicates deleteDuplicates=new DeleteDuplicates();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testDeleteDuplicates() {
		ListNode l = ListUtilities.create(1,1,2);
		ListNode expected = ListUtilities.create(1,2);
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = deleteDuplicates.deleteDuplicates(l); 
		
	
		System.out.println(String.format("Actual=%s", actual));
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}
	@Test
	public final void testDeleteDuplicates2() {
		ListNode l = ListUtilities.create(1,1,2,3,3);
		ListNode expected = ListUtilities.create(1,2,3);
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = deleteDuplicates.deleteDuplicates(l); 
		
		
		System.out.println(String.format("Actual=%s", actual));
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}
	@Test
	public final void testDeleteDuplicates3() {
		ListNode l = ListUtilities.create(1,1,1);
		ListNode expected = ListUtilities.create(1);
		
		System.out.println(String.format("Input=%s", l));
		System.out.println(String.format("Expected=%s", expected));
		
		ListNode actual = deleteDuplicates.deleteDuplicates(l); 
		
		
		System.out.println(String.format("Actual=%s", actual));
		
		assertTrue( ListUtilities.equals(expected,actual) );
	}

}
