package com.poorak.linkedlist;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * For example,
 * 
 * <pre>
 *    Given linked list: 1->2->3->4->5, and n = 2.
 * 
 *    After removing the second node from the end, the linked list becomes 1->2->3->5.
 * </pre>
 * 
 * Note: Given n will always be valid. Try to do this in one pass.
 * 
 * @author poorak
 *
 */
public class RemoveNthFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head;
		ListNode slow = head;
		
		if(fast.next == null && n==1){
			return null;
		}
		
		while(n >0 && fast.next != null){
			fast = fast.next;
			n--;
		}
		
		if(n ==1){
			slow = slow.next;
			return slow;
		}
		
		// list is smaller
		if(n>= 2){
			return head;
		}
		
		
		while(fast.next !=null){
			fast = fast.next;
			slow = slow.next;
		}
		
		slow.next = slow.next.next;
		
		
		
		return head;
	}
}