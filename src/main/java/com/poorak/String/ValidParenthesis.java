package com.poorak.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
 * but "(]" and "([)]" are not.
 * 
 * @author poorak
 *
 */
public class ValidParenthesis {
	private final static Map<Character, Character> map = new HashMap<>(3);

	static {
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

	}


	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		if (s == null || s.isEmpty()) {
			return true;
		}
		if(s.length() ==1 || s.length() %2 != 0) return false;
		for(int i=0; i<s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				stack.add(s.charAt(i));
			}else if(!stack.empty() && map.get(stack.peek()) == s.charAt(i)){
				stack.pop();
				
			}else{
				return false;
			}
		}
		
		return stack.isEmpty();
	}
}
