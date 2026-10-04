class Solution {
    public boolean isValid(String s) {
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                temp = temp + ch;
            }
            else {
                if (temp.length() == 0) {
                    return false;
                }

                char last = temp.charAt(temp.length() - 1);

                if ((ch == ')' && last == '(') ||
                    (ch == ']' && last == '[') ||
                    (ch == '}' && last == '{')) {
                    temp = temp.substring(0, temp.length() - 1);
                }
                else {
                    return false;
                }
            }
        }

        return temp.length() == 0;
    }
}