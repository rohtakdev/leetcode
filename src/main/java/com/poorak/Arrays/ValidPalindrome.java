package com.poorak.Arrays;



/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

 * @author poorak
 *
 */
public class ValidPalindrome {
 public boolean isPalindrome(String s) {

	 
        if(s == null || s.isEmpty()) return true;
   
        int j=s.length() -1;
        
        for(int i=0 ; i < j; ){
        	//char current_i = s.charAt(i);
        	//char current_j = s.charAt(j);
        	if(Character.isLetter(s.charAt(i)) == false && Character.isDigit(s.charAt(i)) == false){
        		i++;
        		continue;
        	}
        	if(Character.isLetter(s.charAt(j)) == false && Character.isDigit(s.charAt(j)) == false){
        		j--;
        		continue;
        	}
        	
        	if(!equalsIgnoreCase(s.charAt(i) , s.charAt(j))){
        		return false;
        	}
        	
        	i++; j--;
        }
        
        return true;
    }
 
    private boolean equalsIgnoreCase(char a, char b){
    
    	if(Character.toLowerCase(a) == Character.toLowerCase(b)){
    		return true;
    	}
    	
    	return false;
    }
}
