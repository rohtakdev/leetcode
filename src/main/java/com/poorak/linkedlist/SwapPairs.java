package com.poorak.linkedlist;

public class SwapPairs {
	 public ListNode swapPairs(ListNode head) {
	        ListNode ptr = new ListNode(0);
	        ptr.next = head;
	        ListNode current = ptr;
	        if(head == null || head.next == null) return head;
	        
	        while(current.next !=null && current.next.next !=null){
	        	current.next = swap(current.next, current.next.next);
	          
	            //
	            current = current.next.next;
	        }
	        
	        return ptr.next;
	    }
	    
	    public ListNode swap(ListNode l1, ListNode l2){
	        l1.next= l2.next;
	        l2.next = l1;
	        return l2;
	    }
}
