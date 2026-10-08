class Solution {
    public String compressedString(String word) {
        int i = 0;
        String comp = "";

        while (i < word.length()) {
            int j = i + 1;
            int c = 1;

            while (j < word.length() && word.charAt(i) == word.charAt(j) && c < 9) {
                c++;
                j++;
            }

            comp = comp + c + word.charAt(i);
            i = j;
        }

        return comp;
    }
}