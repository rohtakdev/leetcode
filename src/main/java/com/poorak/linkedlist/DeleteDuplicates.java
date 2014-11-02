package com.poorak.linkedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element
 * appear only once.
 * 
 * <pre>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * </pre>
 * 
 * @author poorak
 *
 */
public class DeleteDuplicates {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null) return head;
	        ListNode headPoint =head;
	        
	        while(head.next !=null){
	        	if(head.val == head.next.val){
		        	head.next = head.next.next;
		        }else{
		        	head = head.next;
		        }
	        }
	        
	        return headPoint;
	    }
}
