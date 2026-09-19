class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr = new ArrayList<>();

        int j = 0;

        for(int i = 1; i <= n; i++) {

            if(i == target[j]) {
                arr.add("Push");
                j++;
            }
            else {
                arr.add("Push");
                arr.add("Pop");
            }

            if(j == target.length) {
                break;
            }
        }

        return arr;
    }
}