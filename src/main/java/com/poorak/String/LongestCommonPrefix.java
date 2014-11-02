package com.poorak.String;

import java.util.Arrays;

public class LongestCommonPrefix {
	 public String longestCommonPrefix(String[] strs) {
		 
		 if(strs.length == 1) return strs[0];
		 if(strs ==null || strs.length ==0) return "";
		 
		 char[] current=strs[0].toCharArray();
	      
	        for(int i=1,j=0;i<strs.length ;){
	        
	        	if(strs[i].equals(new String(current))){
	        		i++;
	        		continue;
	        	}
	        	
	        	if(strs[i-1] != "" && strs[i-1].length()-1 >= j && strs[i].length()-1 >= j && strs[i-1].charAt(j) == strs[i].charAt(j)){
	        	
	        		j++;
	        		continue;
	        	}
	    
	        	
	        	if(i ==1 || j > current.length) {
	        		current = Arrays.copyOfRange(strs[i].toCharArray(), 0, j);
	        		j=0;
	        	}
	        	
	        	i++;
	        	
	        }
	        
	        return new String(current);
	    }
}
