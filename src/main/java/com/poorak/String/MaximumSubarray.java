package com.poorak.String;
/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.

 * @author poorak
 *
 */
public class MaximumSubarray {
	 public int maxSubArray(int[] A) {
		    int newsum=A[0];
	        int max=A[0];
	        
	        for(int i=1;i<A.length ;i++){
	        	newsum=Math.max(newsum+A[i],A[i]);
	            max= Math.max(max, newsum);
	        }
	        
	        return max;
	    }
}
