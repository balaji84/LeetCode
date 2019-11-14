//Runtime: 1 ms, faster than 100.00% of Java online submissions for Surrounded Regions.
//Memory Usage: 39.8 MB, less than 96.43% of Java online submissions for Surrounded Regions.

class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        if(r==0)return;
        int c = board[0].length;
         for(int i =0;i<r;i++){
           if(board[i][0]=='O'){
               bfs(board,i,0);
           }
           
           if(board[i][c-1]=='O'){
               bfs(board,i,c-1);
           }
       }
       for(int i =0;i<c;i++){
           if(board[0][i]=='O'){
               bfs(board,0,i);
           }
           
           if(board[r-1][i]=='O'){
               bfs(board,r-1,i);
           }
       }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                else if(board[i][j]=='*'){
                    board[i][j]='O';
                }
            }
        }
        
        
    }
    
    private void bfs(char[][] board, int i, int j){
        
        int r = board.length;
        int c = board[0].length;
        
        //no need to process rows marked with * which says already processed
        //and X which is what we need to change.
        if(i<0 || i>=r ||j<0 ||j>=c|| board[i][j]=='*' ||board[i][j]=='X'  ){
            return;
        }
        //set the value to random value to mark it as visited.
        board[i][j]='*';
        if(i+1<r)
        bfs(board,i+1,j);
        if(i-1<r)
        bfs(board,i-1,j);
        if(j+1<c)
        bfs(board,i,j+1);
        if(j-1<c)
        bfs(board,i,j-1);
        
    }
}
