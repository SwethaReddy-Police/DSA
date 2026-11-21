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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return ans;

        q.offer(root);
        int level = 0;

        while(!q.isEmpty()) {
            int n = q.size();
            List<Integer> al = new ArrayList<>();

            for(int i = 0; i < n; i++) {
                TreeNode node = q.poll();

                al.add(node.val);

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }

            if(level % 2 == 1) {
                Collections.reverse(al);
            }

            ans.add(al);
            level++;
        }

        return ans;
    }
}