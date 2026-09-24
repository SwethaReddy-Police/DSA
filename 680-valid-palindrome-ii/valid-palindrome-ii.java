class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                boolean skip1 = valid(s, i + 1, j);
                boolean skip2 = valid(s, i, j - 1);

                return skip1 || skip2;
            }

            i++;
            j--;
        }

        return true;
    }

    public boolean valid(String s, int i, int j) {
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