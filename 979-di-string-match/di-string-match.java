class Solution {
    public int[] diStringMatch(String s) {

        int n = s.length();

        int[] arr = new int[n + 1];

        int i = 0;
        int j = n;

        for (int k = 0; k < n; k++) {

            if (s.charAt(k) == 'I') {
                arr[k] = i;
                i++;
            }
            else {
                arr[k] = j;
                j--;
            }
        }

        arr[n] = i;

        return arr;
    }
}