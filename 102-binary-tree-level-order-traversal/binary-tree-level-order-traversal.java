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
 class Solution
 {
public List<List<Integer>> levelOrder(TreeNode root) {
    Queue<TreeNode> q = new LinkedList();
    List<List<Integer>> res = new LinkedList();
    
    if(root == null) return res;
    
    q.offer(root);
    while(!q.isEmpty()){
        int lvl = q.size();
        List<Integer> temp = new LinkedList();
        //add all nodes in queue to temp list
        for(int i = 0; i < lvl; i++) {
            TreeNode curr = q.peek();
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
            temp.add(q.poll().val);
        }
        res.add(temp);
    }
    return res;
}
 }