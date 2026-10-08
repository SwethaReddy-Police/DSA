class Solution {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();
        int i = 0;

        while (i < s.length()) {

            int a = i;
            int b = i + k - 1;

            if (b >= s.length()) {
                b = s.length() - 1;
            }

            while (a <= b) {
                char temp = ch[a];
                ch[a] = ch[b];
                ch[b] = temp;

                a++;
                b--;
            }

            i = i + 2 * k;
        }

        return new String(ch);
    }
}