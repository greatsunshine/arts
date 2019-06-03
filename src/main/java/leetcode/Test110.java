package leetcode;

/**
 * DESCRIPTION:判断是不是平衡二叉树
 *
 * @author Coins
 * @create 2019-06-03 14:24
 */
public class Test110 {
	class Solution {
		private boolean isBalanced = true;
		public boolean isBalanced(TreeNode root) {
			getDepth(root);
			return isBalanced;
		}
		public int getDepth(TreeNode root) {
			if (root == null)
				return 0;
			int left = getDepth(root.left);
			int right = getDepth(root.right);
			if (Math.abs(left - right) > 1) {
				isBalanced = false;
			}
			return right > left ? right + 1 : left + 1;
		}
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
