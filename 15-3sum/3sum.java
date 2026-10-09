class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else
                {
                   ArrayList<Integer> l=new ArrayList<>();
                   l.add(nums[i]);
                   l.add(nums[j]);
                   l.add(nums[k]);
                   ans.add(l); 
                   j++;
                   k--;   
                }
            }
        }
    return new ArrayList<>(ans);
    }
}