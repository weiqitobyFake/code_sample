package code_sample;

/*
 * Problem: Given a 2D array, return a list of it's diagonal sum
 * eg. input: 1, 2, 3
 *            4, 5, 6
 *            7, 8, 9
 *     output [7, 12, 15, 8, 3]
 */


import java.util.*;

public class DiagonalSum {
    
    public static List<Integer> digonalSum(int[][] array) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        if (array.length == 0)
            return ans;
            
        if (array.length == 1) {
	        for (int i=0; i<array[0].length; i++)
	            list.add(array[0][i]);
	        return list;
	    }
	    
	    if (array[0].length == 1) {
	        for (int i=array.length-1; i>=0; i++) {
	            list.add(array[i][0]);
	        }
	        return list;
	    }
	    
	    for (int j=0; j < array[0].length; j++) {
	        int t = j;
	        int sum = 0;
	        int i = array.length-1;
	        while (t >= 0 && i>=0) {
	           sum = sum + array[i][t];
	           i--;
	           t--;
	        }
	        list.add(sum);
	    }
	    
	    for (int i = array.length-2; i>=0; i--) {
	        int t = i;
	        int sum = 0;
	        int j = array[0].length-1;
	        while (t >= 0 && j>=0) {
	            sum = sum + array[t][j];
	            t--;
	            j--;
	        }
	        
	        list.add(sum);
	    }
	    
	    return list;
    }
}
