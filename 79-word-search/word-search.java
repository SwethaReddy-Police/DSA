class Solution {
   boolean ans;
    void find(int i,int j,int idx,String word,char[][] board){
        if(idx>=word.length()){
            ans=true;
            return;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length)  return;
        if(board[i][j]!=word.charAt(idx))   return;
        char temp=board[i][j];
        board[i][j]='*';
        find(i,j+1,idx+1,word,board);
        find(i,j-1,idx+1,word,board);
        find(i+1,j,idx+1,word,board);
        find(i-1,j,idx+1,word,board);
        board[i][j]=temp;
        
    }
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0)){
                find(i,j,0,word,board);
            }
        }
       }
       return ans;
    }
}