package code_sample;

import java.util.*;

public class Permutations {
	
	public static void main(String[] args) {
		String string1 = "abc";
		getPermutation(string1);
	}
	
	public static void getPermutation(String string) {
		if (string == null)
			return;
		ArrayList<String> ans = new ArrayList<String>();
		HashSet<String> helper = new HashSet<String>();
		if (string.length() < 2) {
			ans.add(string);
			System.out.println(ans);
		}
		
		ans.add("");
		
		for (int i=0; i<string.length(); i++) {
			ans = helper(ans, helper, string.charAt(i));
		}
		
		System.out.println(ans);
	}
	
	public static ArrayList<String> helper(ArrayList<String> ans, HashSet<String> helper, char ithChar) {
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int k=0; k<ans.size(); k++) {
			String curr = ans.get(k);
			for (int i=0; i<=curr.length(); i++) {
				StringBuilder sb = new StringBuilder();
				sb.append(curr);
				sb.insert(i, ithChar);
				
				String solution = sb.toString();
				if (helper.add(solution))
					temp.add(solution);
			}
		}
		return temp;
	}
}
