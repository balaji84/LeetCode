Important thing to understand in dfs is whether to return or not .

e.g in the below Number of Islands problems

if i return then count will gets incremented for every boundary cases. so i should not use
any return only if recursion completes it is success.


  if(i<0 || j<0 || i>=r || j>=c || grid[i][j]!='1'){
                     return true;
   }



Solution:
==========


      class Solution {
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

       private void dfs(char grid[][], int i, int j){
              int r = grid.length;
              int c = grid[0].length;

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
