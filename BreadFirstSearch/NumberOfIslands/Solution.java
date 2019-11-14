class Solution {

//Runtime: 1 ms, faster than 100.00% of Java online submissions for Number of Islands.
//Memory Usage: 40.9 MB, less than 91.63% of Java online submissions for Number of Islands.

    public int numIslands(char[][] grid) {
        int r = grid.length;
        if(r==0)return 0;
        int c = grid[0].length;
        int count = 0;
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                 if(grid[i][j]=='1'){
                     dfs(grid,i,j);
                       count++;
                }
            }
        }
        
        
        return count;
    }
    
    //use void since if we return for case 
    //i<0 or j<0 or i> row length or j>col
    //then count gets incremented.
    private void dfs(char grid[][], int i, int j){
        int r = grid.length;
        int c = grid[0].length;
        
        //traverse from 1 if adjacent is 0 chance of islands
        //then return to check other sides like
        //        top
        //        |
        // left<- 1-> right
        //        |
        //        right
        
        
        //below is a island. Also outside boundary is also water (0) so return for outof boundary conditions also.
        //    0
        //    |
        //  0-1-0
        //    |
        //    0
        if(i<0 || j<0 || i>=r || j>=c || grid[i][j]!='1'){
                   return;
        }
        grid[i][j]='0';
        if(i-1<r)
        dfs(grid,i-1,j);
         if(i+1<r)
        dfs(grid,i+1,j);
         if(j-1<c)
        dfs(grid,i,j-1);
         if(j+1<c)
        dfs(grid,i,j+1);
        
    }
}
