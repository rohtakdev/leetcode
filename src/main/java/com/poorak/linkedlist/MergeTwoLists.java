package com.poorak.linkedlist;

/**
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * @author poorak
 *
 */
public class MergeTwoLists {
	public ListNode mergeTwoListsI(ListNode l1, ListNode l2) {
		
		if((l1 ==null && l2 ==null )) return null;
		if(l1 ==null) return l2;
		if(l2 ==null) return l1;
		
		if (l1.next == null && l2.next == null)
			return null;

		ListNode merge = l1.val > l2.val ? l2 : l1;
		ListNode other = l2.val > l1.val ? l2 : l1;

		ListNode head = merge;
		while (merge.next != null) {
			if (merge.next.val > other.val) {
				ListNode tmp = merge.next;
				merge.next = other;
				other = tmp;
			}
			merge = merge.next;

		}

		return head;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 ==null) return l2;
		if(l2 ==null) return l1;
		
		if(l1.val < l2.val){
		    l1.next = mergeTwoLists(l1.next, l2);
		    return l1;
		}else{
			
		    l2.next =mergeTwoLists(l2, l1);
		    return l2;
		}
	}
	
}
