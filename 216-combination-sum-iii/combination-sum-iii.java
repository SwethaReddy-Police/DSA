class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        fun(n, 1, k, new ArrayList<>(), 0);
        return ans;
    }

    void fun(int n, int idx, int k, ArrayList<Integer> al, int sum) {

        if (al.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList<>(al));
            }
            return;
        }

        if (idx > 9 || sum > n) {
            return;
        }

        // Take
        al.add(idx);
        fun(n, idx + 1, k, al, sum + idx);

        // Backtrack
        al.remove(al.size() - 1);

        // Not Take
        fun(n, idx + 1, k, al, sum);
    }
}