class Solution {
    public String removeOuterParentheses(String s) {
        int c1=0;
        int c2=0;

        int f=0;
        int e=0;
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
               c1++;
            }
            else if(s.charAt(i)==')')
            {
                c2++;
                e=i;
            }
            if(c1==c2)
            {
             st+=s.substring(f+1,e);
             f=e+1;
             e=e+1;
            }
        }
return st;
        
    }
}