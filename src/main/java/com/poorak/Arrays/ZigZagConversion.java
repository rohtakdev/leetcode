package com.poorak.Arrays;

public class ZigZagConversion {
	public String convert(String s, int nRows) {
        if(s ==null ) return s;
        if(s.isEmpty()) return s;
        
        if(nRows == 1) return s;
        
        if(nRows >= s.length()) return s;
        
        int next = 3 + (3-nRows) *2;
        
        String result ="";
        
        for(int i=0; i<nRows ; i++){
            for(int j=i;j< s.length();j=j+next){
                result += s.charAt(j);
            }
         }
        
        return result;
    }
}
