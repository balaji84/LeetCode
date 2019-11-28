class Solution {
    int[][] graph;
    int len;
    public int shortestPathLength(int[][] graph) {
        int len = graph.length;
       this.graph = graph;
        this.len = len;
       
        int result =0;
        for(int i =0;i<len;i++){
          boolean visited[] = new boolean[len];
             result = Math.max(result, dfs(graph,i,visited,0));
             if(result == len-1)return len-1;
        }
        
       return  2*len-2-result; 
    }
 
    
    private int dfs(int[][] graph , int start,boolean[] visited,int count){
        int result = count;
        if(visited[start]) return 0;
        
        visited[start] =true;
        
        for(int toIndex : graph[start]){
            result= Math.max(result,dfs(graph,toIndex,visited,count+1));
              if(result == len-1)return len-1;
        }
        visited[start] =false;
        
        return  result;
    }
}
