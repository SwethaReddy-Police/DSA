class Solution {
    public String removeDuplicates(String s) {
        
        Stack <Character> st =new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
                i++;
            }
            else
            {
                if(s.charAt(i)!=st.peek())
                {
                    st.push(s.charAt(i));
                    i++;
                }
                else
                {
                    st.pop();
                    i++;
                }
            }
        }
        String str="";
        for(int j=0;j<st.size();j++)
        {
            str=str+st.get(j);
        }
        return str;
    }
}