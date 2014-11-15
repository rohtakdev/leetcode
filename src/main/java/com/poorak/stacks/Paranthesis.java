package com.poorak.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Paranthesis {
	private static final Map<Character, Character> mapper = new HashMap<>();
    private static final Stack S = new Stack();
    static{
        mapper.put('(' , ')' );
          mapper.put( '{' ,'}');
            mapper.put('[' ,']');
            
         
    }
    public boolean isValid(String s) {
        if(s ==null ||  s.length()%2 !=0) return false;
        for(int i =0; i<s.length();i++){
          char c = s.charAt(i);
          switch(c){
              case '(':
              case '[':
              case '{' :
                  S.push(c);
                   break;
              case ')':
              case ']':
              case '}':
                  if(S.isEmpty()) return false;
                  if(!S.isEmpty() && c != mapper.get(S.pop()) ) return false;
                  break;
          }
          
            
        }
        
        return S.isEmpty();
        
        
    }
}
