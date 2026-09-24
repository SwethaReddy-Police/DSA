class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;

        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            int rem = 0;

            while(temp > 0) {
                rem = rem + temp % 10;
                temp = temp / 10;
            }

            if(rem == i) {
                return i;
            }
        }

        return ans;
    }
}
