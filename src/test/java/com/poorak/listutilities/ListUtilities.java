package com.poorak.listutilities;

import com.poorak.linkedlist.ListNode;

public class ListUtilities {
	public static boolean equals(ListNode l1, ListNode l2) {
		while(l1.next !=null && l2.next !=null){
			if(!l1.equals(l2)){
				return false;
			}
			l1 = l1.next;
			l2=l2.next;
		}
		
		return l1.next ==null ? l2.next ==null ? true: false : false;
	}

	public static ListNode create(int... val) {
		ListNode current = new ListNode(val[0]);
		ListNode currentHead = current;

		for (int i = 1; i < val.length; i++) {
			ListNode tmp = new ListNode(val[i]);
			current.next = tmp;
			current = current.next;
		}

		return currentHead;
	}
}
