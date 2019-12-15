

https://github.com/arunsadhasivam/LeetCode/tree/master/DFS/RecursionPatterns/LongestIncreasingPaths



Variable Sharing 
================

       max ++;
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

        int res  =  Math.max(Math.max(Math.max(max1,max2),max3),max4);
        max = Math.max(res,max);    
        dp[i][j]=max;
        
  Above wont work because we generate max for coordinates(x,y)  i.e from starting (0,0) -(0,1),(1,0)
  
  so we can't share max to all instead we need calculate max for top,bottom,left,right separately and calculate max
  from 4(left,right,up,bottom) . so we should use below 2 either of 2 approaches work.
  
  Approach 1:
  ===========
  
  Add 1 seaparately to each coordinates 
  
   max1 =1+dfs(matrix,i+1,j,max,prev,visited,dp);//right
        max2= 1+dfs(matrix,i-1,j,max,prev,visited,dp);//left
        max3= 1+dfs(matrix,i,j-1,max,prev,visited,dp);//up
        max4 =1+dfs(matrix,i,j+1,max,prev,visited,dp);//bottom.
        
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

        int res  =  Math.max(Math.max(Math.max(max1,max2),max3),max4);
        max = Math.max(res,max);    
        dp[i][j]=max;
        
    Approach 2:
    ===========
    
    Add 1 at the res after calculating max of four
       int max1 =0,max2=0,max3=0,max4=0;
        //calculate distance at each coordinates like  (0,0)(0,1),(1,0),(-1,0),(0,-1) get the 
        //value at each co-ordinates(top,left,right,bottom) 
        
       // max++;
        max1 =dfs(matrix,i+1,j,max,prev,visited,dp);//right
        max2= dfs(matrix,i-1,j,max,prev,visited,dp);//left
        max3= dfs(matrix,i,j-1,max,prev,visited,dp);//up
        max4 =dfs(matrix,i,j+1,max,prev,visited,dp);//bottom

        int res  =  Math.max(Math.max(Math.max(max1,max2),max3),max4)+1;
        max = Math.max(res,max);    
       
