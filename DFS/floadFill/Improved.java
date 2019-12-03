//Runtime: 1 ms, faster than 87.46% of Java online submissions for Flood Fill.
//Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Flood Fill.

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        int r = image.length;
        int c = image[0].length;
        boolean visited[][]= new boolean[r][c];
        int color = image[sr][sc];
        //remove 2 for loops.
        dfs(image,sr,sc,color,newColor,visited);
            
      
     
        
        return image;
        
    }
    
    
    private void dfs(int[][] image, int i, int j,int color, int newColor,boolean visited[][]){
        
        int r = image.length;
        int c = image[0].length;
        
        if(i<0 || j<0 || i>=r || j>=c || image[i][j]!=color || visited[i][j]){
            return;
        }
        
        image[i][j]=newColor;
        visited[i][j]=true;
        
        if(i+1<r)
        dfs(image,i+1,j,color,newColor,visited);
        if(i-1>=0)
        dfs(image,i-1,j,color,newColor,visited);
        if(j-1>=0)
        dfs(image,i,j-1,color,newColor,visited);
        if(j+1<c)
        dfs(image,i,j+1,color,newColor,visited);
        
        visited[i][j]=false;
    }
}
