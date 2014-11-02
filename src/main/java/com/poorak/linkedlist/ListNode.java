package com.poorak.linkedlist;

public class ListNode {
	public int val;

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}

	public ListNode next;

	public ListNode(int x) {
		val = x;
		next = null;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + val;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListNode other = (ListNode) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (val != other.val)
			return false;
		return true;
	}

}