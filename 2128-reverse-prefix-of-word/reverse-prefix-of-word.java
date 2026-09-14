class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.indexOf(ch);
        char arr[] =word.toCharArray();
        int i=0;
        int j=n;
        while(i<j)
        {
          char temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        return new String(arr);
        
    }
}