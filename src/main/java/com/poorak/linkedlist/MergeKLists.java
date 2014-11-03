package com.poorak.linkedlist;

import java.util.List;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and
 * describe its complexity.
 * 
 * @author poorak
 *
 */
public class MergeKLists {
	public ListNode mergeKLists(List<ListNode> lists) {
		if(lists ==null || lists.isEmpty()) return null;
		ListNode merged = lists.get(0);
		for(int i=1; i< lists.size();i++){
			merged = mergeTwoLists(merged, lists.get(i));
		}
		return merged;
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 ==null) return l2;
		if(l2 ==null) return l1;
		
		if(l1.val < l2.val){
		    l1.next = mergeTwoLists(l1.next, l2);
		    return l1;
		}else{
			
		    l2.next =mergeTwoLists(l2.next, l1);
		    return l2;
		}
	}
}
