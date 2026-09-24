class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int k = n - 2;

        for(int i = 2; i <= k; i++) {
            String s = "";
            int temp = n;

            while(temp > 0) {
                int rem = temp % i;
                s = s + rem;
                temp = temp / i;
            }

            if(!check(s)) {
                return false;
            }
        }

        return true;
    }

    public boolean check(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}