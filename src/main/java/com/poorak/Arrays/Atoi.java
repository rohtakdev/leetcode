package com.poorak.Arrays;

/**
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given
 * input specs). You are responsible to gather all the input requirements up
 * front.
 * 
 * @author poorak
 *
 */
public class Atoi {
	public int atoi(String str) {
		char[] s = str.trim().toCharArray();
		
		if(s.length == 0) return 0;
		
		boolean isNeg = false;
		int atoi = 0;
		int i =0;
		if(s[0] == '-') {
			isNeg = true;
			i++;
		}else if(s[0] == '+'){
			i++;
		}
		
		
		for(; i< s.length;i++){
			if(s[i] < '0' || s[i] > '9') return isNeg ? -atoi: atoi;
			int tmp = s[i] - '0';
		    //check integer overflow
			int mul = atoi*10;
			if(mul/10  != atoi){
				if(isNeg){
					return -2147483648;
				}else{
					return 2147483647;
				}
			}
			
			int toAdd = tmp + mul;
			
				if(toAdd < 0){
					if(isNeg){
						return -2147483648;
					}else{
						return 2147483647;
					}
					
				}
				
			atoi = toAdd;
		}

		return isNeg ? -atoi: atoi;
	}
}
