class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        fun(nums, 0, new ArrayList<>());
        return ans;
    }

    void fun(int nums[], int idx, ArrayList<Integer> al) {

        if (idx >= nums.length) {
            ans.add(new ArrayList<>(al));
            return;
        }

        // Take
        al.add(nums[idx]);
        fun(nums, idx + 1, al);

        // Backtrack
        al.remove(al.size() - 1);

        // Not Take
        while(idx+1<nums.length && nums[idx]==nums[idx+1])
        {
            idx++;
        }
        fun(nums, idx + 1, al);
    }
}