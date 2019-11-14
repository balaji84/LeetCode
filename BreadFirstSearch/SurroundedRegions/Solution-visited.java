//Runtime: 4 ms, faster than 20.90% of Java online submissions for Surrounded Regions.
//Memory Usage: 40.4 MB, less than 96.43% of Java online submissions for Surrounded Regions.

class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        if(r==0)return;
        int c = board[0].length;
        
        boolean visited[][] = new boolean[r][c];
         for(int i =0;i<r;i++){
           //every time go for bfs pass new visited flag 
           //track visited.
           visited = new boolean[r][c];
           if(board[i][0]=='O'){
               bfs(board,i,0,visited);
           }
           
           if(board[i][c-1]=='O'){
               bfs(board,i,c-1,visited);
           }
       }
       for(int i =0;i<c;i++){
           visited = new boolean[r][c];
           if(board[0][i]=='O'){
               bfs(board,0,i,visited);
           }
           
           if(board[r-1][i]=='O'){
               bfs(board,r-1,i,visited);
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
    
    private void bfs(char[][] board, int i, int j,boolean[][] visited){
        
        int r = board.length;
        int c = board[0].length;
        
       
        //no need to process rows marked with * which says already processed
        //and X which is what we need to change.
        if(i<0 || i>=r ||j<0 ||j>=c|| visited[i][j] || board[i][j]!='O'){
            return;
        }
        
        board[i][j]='*';
        visited[i][j]=true;
        
        //set the value to random value to mark it as visited.
        
        if(i+1<r)
        bfs(board,i+1,j,visited);
        if(i-1<r)
        bfs(board,i-1,j,visited);
        if(j+1<c)
        bfs(board,i,j+1,visited);
        if(j-1<c)
        bfs(board,i,j-1,visited);
        //after bfs backtracking 
        visited[i][j]=false;
        
    }
}
