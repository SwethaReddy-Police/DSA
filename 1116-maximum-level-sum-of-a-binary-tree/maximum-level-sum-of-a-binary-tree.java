class Solution {
    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
            return 0;

        q.offer(root);

        int max = Integer.MIN_VALUE;
        int level = 1;
        int ans = 0;

        while(!q.isEmpty())
        {
            int sum = 0;
            int n = q.size();

            for(int i = 0; i < n; i++)
            {
                TreeNode node = q.poll();

                sum = sum + node.val;

                if(node.left != null)
                {
                    q.offer(node.left);
                }

                if(node.right != null)
                {
                    q.offer(node.right);
                }
            }

            if(sum > max)
            {
                max = sum;
                ans = level;
            }

            level++;
        }

        return ans;
    }
}