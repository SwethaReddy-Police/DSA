class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
        {
            return ans;
        }

        q.offer(root);

        while(!q.isEmpty())
        {
            List<Integer> al = new ArrayList<>();

            int n = q.size();

            for(int i = 0; i < n; i++)
            {
                TreeNode node = q.poll();

                al.add(node.val);

                if(node.left != null)
                {
                    q.offer(node.left);
                }

                if(node.right != null)
                {
                    q.offer(node.right);
                }
            }

            ans.add(al);
        }

        return ans;
    }
}