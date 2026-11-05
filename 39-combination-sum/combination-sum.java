class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void find(int arr[], int tar, int idx, ArrayList<Integer> al)
    {
        if(tar == 0)
        {
            ans.add(new ArrayList<>(al));
            return;
        }

        if(idx >= arr.length || tar < 0)
        {
            return;
        }

        al.add(arr[idx]);
        find(arr, tar-arr[idx], idx, al);

        al.remove(al.size()-1);

        find(arr, tar, idx+1, al);
    }

    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        find(arr, tar, 0, new ArrayList<>());
        return ans;
    }
}