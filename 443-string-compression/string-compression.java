class Solution {
    public int compress(char[] chars) {
        int i = 0;
        String s = "";

        while (i < chars.length) {
            int j = i + 1;
            int c = 1;

            while (j < chars.length && chars[i] == chars[j]) {
                c++;
                j++;
            }

            if (c == 1) {
                s = s + chars[i];
            } else {
                s = s + chars[i] + c;
            }

            i = i+c;
        }
        int k;
        for ( k = 0; k < s.length(); k++) {
            chars[k] = s.charAt(k);
        }

        return k;
    }
}