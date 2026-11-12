class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        fun(n, 1, k, new ArrayList<>());
        return ans;
    }
    void fun(int n, int idx, int k, ArrayList<Integer> al) {

        if (al.size() == k) {
            ans.add(new ArrayList<>(al));
            return;
        }
        if (idx > n) {
            return;
        }
        al.add(idx);
        fun(n, idx + 1, k, al);
        al.remove(al.size() - 1);
        fun(n, idx + 1, k, al);
    }
}