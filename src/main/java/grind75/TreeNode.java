package grind75;
//https://leetcode.com/problems/invert-binary-tree/submissions/964348084/

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root.left != null && root.right != null) {
                TreeNode temp = new TreeNode();
                temp.val = root.val;
                temp.left = root.right;
                temp.right = root.left;
                invertTree(temp.left);
                invertTree(temp.right);

            }
            return root;

        }
    }


}
