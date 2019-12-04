//Runtime: 3 ms, faster than 49.44% of Java online submissions for Max Area of Island.
//Memory Usage: 45.2 MB, less than 29.63% of Java online submissions for Max Area of Island.

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int r = grid.length;
        int c = grid[0].length;
        
        
        boolean  visited[][] = new boolean[r][c];
        int maxArea = 0;

         for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1  &&!visited[i][j] ){
                   int count = dfs(grid,i,j,0,visited);
                    maxArea = Math.max(count,maxArea);
                }
            }
        }
        
        return maxArea;
    }
    
    private int  dfs(int grid[][], int i, int j,int count,boolean[][] visited){
        int r = grid.length;
        int c = grid[0].length;
        if(i<0 || j<0 || i>=r || j>=c|| visited[i][j] || grid[i][j]==0){
            return  count;
        }

        visited[i][j]=true;
        
       // grid[i][j]=0;
        count++;
       count=dfs(grid,i+1,j,count,visited);
       count=dfs(grid,i-1,j,count,visited);
        count=dfs(grid,i,j-1,count,visited);
        count=dfs(grid,i,j+1,count,visited);
       // visited[i][j]=false; //should not be added.
        
        return count;
    }
}
