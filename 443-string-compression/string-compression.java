class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int a = 0;

        while (i < chars.length) {
            int j = i + 1;
            int c = 1;

            while (j < chars.length && chars[i] == chars[j]) {
                c++;
                j++;
            }

            chars[a] = chars[i];
            a++;

            if (c > 1) {
                String count = String.valueOf(c);

                if (c < 10) {
                    chars[a] = count.charAt(0);
                    a++;
                }
                else if (c < 100) {
                    chars[a] = count.charAt(0);
                    a++;
                    chars[a] = count.charAt(1);
                    a++;
                }
                else if (c < 1000) {
                    chars[a] = count.charAt(0);
                    a++;
                    chars[a] = count.charAt(1);
                    a++;
                    chars[a] = count.charAt(2);
                    a++;
                }
                else {
                    chars[a] = count.charAt(0);
                    a++;
                    chars[a] = count.charAt(1);
                    a++;
                    chars[a] = count.charAt(2);
                    a++;
                    chars[a] = count.charAt(3);
                    a++;
                }
            }

            i = j;
        }

        return a;
    }
}