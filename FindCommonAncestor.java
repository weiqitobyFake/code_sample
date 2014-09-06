package code_sample;

public class FindAncestor {

	// This method is used to find the nearest
	// ancestor of two nodes in a Binary Tree
	public TreeNode find(TreeNode root, TreeNode a, TreeNode b) {
		if (root == null)
			return root;
		if (root == a || root == b)
			return root;
		if (!covers(root, a) || !covers(root, b))
			return null;
		boolean leftSide = covers(root.left, a);
		boolean	rightSide = covers(root.left, b);
		
		if (leftSide != rightSide) {
			return root;
		}
		TreeNode sideNode = covers(root.left, a) ? root.left : root.right;
		return find(sideNode, a, b);
	}

	// This function is to check whether if a covers b
	public boolean covers(TreeNode a, TreeNode b) {
		if (b == null)
			return false;
		if (a == b)
			return true;
		if (a == null)
			return false;

		return covers(a.left, b) || covers(a.right, b);
	}

	public static void main(String[] args) {
		// test the function

		TreeNode yi = new TreeNode(1);
		TreeNode er = new TreeNode(2);
		TreeNode san = new TreeNode(3);
		TreeNode si = new TreeNode(4);
		TreeNode wu = new TreeNode(5);
		TreeNode liu = new TreeNode(6);
		TreeNode qi = new TreeNode(7);
		TreeNode ba = new TreeNode(8);
		TreeNode jiu = new TreeNode(9);
		TreeNode shi = new TreeNode(10);

		yi.left = er;
		yi.right = san;
		er.left = si;
		er.right = wu;
		san.left = liu;
		san.right = qi;
		si.left = ba;
		si.right = jiu;
		wu.left = shi;

		FindAncestor f = new FindAncestor();
		System.out.println(f.find(yi, liu, qi));
	}
}
