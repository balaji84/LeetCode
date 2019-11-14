//Runtime: 2 ms, faster than 86.09% of Java online submissions for Rotting Oranges.
//Memory Usage: 40.8 MB, less than 68.75% of Java online submissions for Rotting Oranges.
class Solution {
    public int orangesRotting(int[][] grid) {
        
        int r = grid.length;
        int c = grid[0].length;
        
        int fresh=0,rotton=0,empty =0;
        
        LinkedList<Node> queue = new LinkedList<Node>();
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                
                if(grid[i][j]==2){
                    queue.offer(new Node(i,j));
                }
                if(grid[i][j]==0){
                    empty++;
                }
                
                if(grid[i][j]==1){
                    fresh++;
                }
                
            }
        }
        
        if(fresh == 0 )return 0;
       int result =  process (queue,grid,fresh);
       
        return result;
        
    }
    
    
    private int process( LinkedList<Node> queue , int grid[][],int fresh){
        
        int r = grid.length;
        int c = grid[0].length;
        int layer  = 0;
        int dirs[][] = {{-1,0},{1,0},{0,1},{0,-1}};
        
         while(!queue.isEmpty()){
             int len = queue.size();
             for(int k =0;k<len ;k++){
                  Node node = queue.poll();
                  int i = node.x;
                  int j = node.y;
                 for(int dir[] : dirs){
                     int x= i +dir[0];
                     int y= j+dir[1];

                     //0-empty and rotton never checked again.
                     if(x<0 ||y<0 ||x>=r ||y>=c|| grid[x][y]==0 ||grid[x][y]==2){
                         continue;
                     }
                      grid[x][y]=2;//fresh got rotton.
                      fresh--;//since rotton reduce the fresh counter
                     queue.offer(new Node(x,y));
                 }
             }
            
             layer ++;
        }
        //if no fresh fruit means all rotton so no of time taken = layer-1
        //if fresh remainging means some block is there so no where it gets rotton
        //like 
        //2 1 1 
        //0 1 1
        //1 0 1
        //here l in the last row left never gets rotton since bottom right and top row has
        //one empty cell
        //0
        //1 0
         return fresh>0?-1:layer-1;
    }
    
    
    
    
}

class Node{
    int x, y;
    
    Node(int x, int y){
       this.x = x;
       this.y = y;
    }
}
