package com.poorak.linkedlist;

public class Partition {
	 public ListNode partition(ListNode head, int x) {
	        if(head == null || head.next == null) return head;
	        
	        ListNode less = null;
	        ListNode greater =null;
	        ListNode lessHead =null;
	        ListNode greaterHead =null;
	        
	        while(head !=null){
	            if(head.val < x) {
	                if(less ==null) {
	                	less= new ListNode(head.val);
	                	lessHead = less;
	                }
	                else {
	                    less.next=new ListNode(head.val);
	                    less= less.next;
	                }
	            }else{
	                if(greater ==null) {
	                	greater=new ListNode(head.val);
	                	greaterHead = greater;
	                }
	                else {
	                    greater.next=new ListNode(head.val);
	                    greater = greater.next;
	                }
	            }
	            head = head.next;
	        }
	      if(less == null) return greaterHead;
	      
	      less.next = greaterHead;
	      
	      return lessHead;
	    }
}
