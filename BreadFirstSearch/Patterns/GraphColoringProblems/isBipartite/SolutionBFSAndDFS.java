class Solution {
     public boolean isBipartite(int[][] g) {
       int[] colors = new int[g.length];
         
         
        for (int i = 0; i < g.length; i++){
            if (colors[i] == 0) {
             //if(!bfs(g,colors,i,1)) return false;  
              if(!dfs(g,colors,i,1)) return false;
            }
        }
        return true;
    }
    
    //1 ms, faster than 65.71% 
    //44.9 MB, less than 60.98%
    private boolean bfs(int[][] g,int[] colors ,int index,int color ){
        Queue<Integer> q = new LinkedList<>();
        q.add(index);
        colors[index] = color;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (int adjacent : g[node]){
                if (colors[adjacent] == colors[node])
                    return false;
                else if (colors[adjacent] == 0) {
                    q.add(adjacent);
                    colors[adjacent] = -colors[node];
                }
            }
        }
        
        return true;
    }
    
    //Runtime: 0 ms, faster than 100.00% of Java online submissions .
    //Memory Usage: 44.2 MB, less than 63.42% of Java online submissions .

    private boolean dfs(int[][] graph, int[] colors, int index,int color) {
        if (colors[index] == -color)
            return false;
        colors[index] = color;
        for (int other: graph[index]) {
            if (colors[other] == color)
                return false;
            if (colors[other] == 0)
                if (!dfs(graph,colors, other, -color))
                    return false;
        }
        return true;
    }
   
}
