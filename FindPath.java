package code_sample;

import java.util.*;

public class FindPath {
	
	// This problem is to find the paths that start from root but can end not just on leaves
	// and the value of each nodes in the path sum to a target
	
	public static void printPath(TreeNode root, int target) {
		if (root == null)
			return;
		helper(root, 0, target, new ArrayList<TreeNode>());
	}
	
	public static void helper(TreeNode node, int sum, int target, ArrayList<TreeNode> t) {
		if (node == null)
			return;
		
		sum = sum + node.val;
		t.add(node);
		
		
		if (sum == target) {
			System.out.println(t);
		}
		
		helper(node.left, sum, target, t);
		helper(node.right, sum, target, t);
		t.remove(t.size()-1);
		sum = sum - node.val;
	}
	
	public static void main(String[] args) {
		
		TreeNode yi = new TreeNode(1);
		TreeNode er = new TreeNode(2);
		TreeNode san = new TreeNode(3);
		TreeNode si = new TreeNode(4);
		TreeNode wu = new TreeNode(5);
		TreeNode liu = new TreeNode(6);
		TreeNode qi = new TreeNode(7);
		
		yi.left = er; yi.right = san;
		er.left = si; er.right = wu;
		san.left = liu; san.right = qi;
		
		printPath(yi, 7);
	}
}
