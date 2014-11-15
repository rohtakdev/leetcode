package com.poorak.linkedlist;

public class Partition {
	 public ListNode partition1(ListNode head, int x) {
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
	 
	 public ListNode partition(ListNode head, int x) {
	        if(head == null || head.next == null) return head;
	        
	       
	        
	        //new list for greater values
	        ListNode greater = new ListNode(0);
	        ListNode greaterHead = greater;
	        
	           
	        ListNode current =new ListNode(0);
	        current.next =head;
	             
	             
	       ListNode currentHead  = current;
	    
	       
	             
	        while(current.next != null){
	            if(current.next.val>=x){
	              greater.next = new ListNode(current.next.val);
	              greater = greater.next;
	              current.next = current.next.next;
	        }
	            else{
	              current = current.next;
	            }
	        
	        }
	        current.next =greaterHead.next;
	        return currentHead.next;
	    }
}
