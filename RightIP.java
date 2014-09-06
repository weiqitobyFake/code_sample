// You can get to know how to use recursion
// Given a String only contains digits, returning the possible IP addresses.
// eg. Given "25525511135", return ["255.255.11.135", "255.255.111.35"] (order does not matter)

package crackingCoding;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		String add = "16819415";
		
		System.out.println(restoreIpAddresses(add));
	}
	
	public static List<String> restoreIpAddresses(String s) {
        List<String> ans = new ArrayList<String>();
        
        if (s == null || s.length() < 4 || s.length() > 12)
            return ans;
            
        dfs(ans, s, new String(), 0, 0);
        
        return ans;
    }
    
    public static void dfs(List<String> ans, String s, String temp, int count, int pos) {
        
        // This part dealing with the last section of this IP address. See how it goes
        if (count == 3) {
        	String sub = s.substring(pos, s.length());
        	if (isValid(sub)) {
        		String newTemp = temp + sub;
        		ans.add(newTemp);
        	}
        	return;
        }
        
        for (int i=0; i<4; i++) {
        	int end = pos + i;
        	if (end > s.length())
        		return;
        	
        	String sub = s.substring(pos, end);
        	if (isValid(sub)) {
        		dfs(ans, s, temp+sub+".", count+1, end);
        	}
        }
    }
    
    public static boolean isValid(String string) {
        if (string == null || string.length() == 0)
            return false;
        
        if (string.charAt(0) == '0')
            return string.equals("0");
        
        int a = Integer.parseInt(string);
        return a <= 255 && a>0;
    }
}
