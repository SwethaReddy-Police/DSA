/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        fun(root, al);
        return al;
    }

    public void fun(TreeNode root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }

        fun(root.left, al);
        fun(root.right, al);
        al.add(root.val);
    }
}