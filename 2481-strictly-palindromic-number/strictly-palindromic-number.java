class Solution {
    public boolean isStrictlyPalindromic(int n) {

        for(int base = 2; base <= n - 2; base++) {

            int temp = n;
            int result = 0;
            int place = 1;

            while(temp > 0) {
                int rem = temp % base;
                result = result + rem * place;
                place = place * 10;
                temp = temp / base;
            }

            if(!check(result)) {
                return false;
            }
        }

        return true;
    }

    public boolean check(int n) {
        int temp = n;
        int reverse = 0;

        while(temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp = temp / 10;
        }

        return n == reverse;
    }
}