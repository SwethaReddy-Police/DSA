class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack <Integer> st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]<=arr[i])
            {
               st.pop();
            }
            if(st.isEmpty())
            {
                ans[i]=0;
                st.push(i);
            }
            else
            {
              int a=st.peek()-i;
              ans[i]=a;
              st.push(i);
            }
        }
       return ans;
        
    }
}