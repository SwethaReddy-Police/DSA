class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> st = new Stack<>();
        int j = 0;

        while(i < pushed.length)
        {
            st.push(pushed[i]);
            i++;

            if(st.peek() == popped[j])
            {
                while(!st.isEmpty() && popped[j] == st.peek())
                {
                    st.pop();
                    j++;
                }
            }
        }

        return st.isEmpty();
    }
}