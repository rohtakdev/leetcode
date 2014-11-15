package com.poorak.linkedlist;

public class Sort {
	  public ListNode sortList(ListNode head) {
	        if(head == null || head.next == null ) return head;
	        
	        ListNode mid =findMid(head);
	        ListNode r = sortList(mid);
	        mid =null;
	        ListNode l = sortList(head);
	        
	        ListNode sorted = merge(l,r);
	        
	        return sorted;
	    }
	    
	    public ListNode findMid(ListNode head){
	    	System.out.println("head - "+head);
	        ListNode s =head;
	        ListNode f = head;
	        while(f !=null && f.next !=null){
	            s= s.next;
	            f = f.next.next;
	        }
	        System.out.println("mid - "+s);
	        return s;
	    }
	    
	    public ListNode merge(ListNode l1, ListNode l2){
	        ListNode s = new ListNode(-1);
	        ListNode sPtr = s;
	        
	        while(l1 !=null ||l2 !=null){
	            if(l1.val < l2.val){
	                s.next = new ListNode(l1.val);
	                s = s.next;
	                l1 = l1.next;
	            }else{
	                 s.next = new ListNode(l2.val);
	                s = s.next;
	                l2 = l2.next;
	            }
	        }
	        
	        if(l1 != null) l2.next = l1;
	        if(l2 != null) l1.next = l2;
	        
	        return sPtr.next;
	    }
}
