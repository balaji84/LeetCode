class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int max = 1;
        int r = matrix.length;
        if(matrix==null || r==0)return 0;
        int c = matrix[0].length;
        
        boolean visited[][] = new boolean[r][c];
        
        int dp[][] = new int [r][c];
        
        LinkedList<Integer> list= new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
               int temp = dfs(matrix, i ,j,0,-1,visited,dp);
                max = Math.max(temp,max);
            }
        }
        
        return max;
    }
    
    
    private int dfs(int  matrix[][], int i,int j , int max,int prev, boolean visited[][],int dp[][]){
        int r = matrix.length;
        int c = matrix[0].length;
       
       //check curval less than prev then return
        if(i<0 ||j<0 ||i>=r || j>=c||matrix[i][j]==-1||  (matrix[i][j]<=prev )){
        
            return max;
        }
        if(dp[i][j]!=0)return dp[i][j];
         prev = matrix[i][j];
        int max1 =0,max2=0,max3=0,max4=0;
        //calculate distance at each coordinates like  (0,0)(0,1),(1,0),(-1,0),(0,-1) get the 
        //value at each co-ordinates(top,left,right,bottom) 
        
        max1 =dfs(matrix,i+1,j,max,prev,visited,dp);
        max2= dfs(matrix,i-1,j,max,prev,visited,dp);
        max3= dfs(matrix,i,j-1,max,prev,visited,dp);
        max4 =dfs(matrix,i,j+1,max,prev,visited,dp);
        
        //out of 4 (top,bottom,left,right) which is maximum consider that as maximum
        //need to use dp because we cant use visited matrix to track visited 
        //because  9,6,2,1-4 is largest we cant mark 9(0,0) as visited because we need to do
        //dfs from 9,9 also if in case that way we find maximum we need to update as maximum
        //so we need to memoize (0,0) (0,1),(1,0) i.e start point of row+column as visited so memoize and retun
        //if maximum for (row,column) precalculated already else do again dfs.
        //[
        //  [9,9,4],
        //  [6,6,8],
        //  [2,1,1]
        //] 

        int res  =  Math.max(Math.max(Math.max(max1,max2),max3),max4)+1;
        max = Math.max(res,max);    
        dp[i][j]=max;
        
       return max;
        
    }
}
