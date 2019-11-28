class Solution {
     public boolean isBipartite(int[][] g) {
       int[] colors = new int[g.length];
         
         
        for (int i = 0; i < g.length; i++){
            if (colors[i] == 0) {
              if(!bfs(g,colors,i)) return false;  
              //if(!dfs(g,i,colors,1)) return false;
            }
        }
        return true;
    }
    
    //1 ms, faster than 65.71% 
    //44.7 MB, less than 63.42%
    private boolean bfs(int[][] g,int[] colors ,int i ){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i] = 1;
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

    private boolean dfs(int[][] graph, int current, int[] colors, int color) {
        if (colors[current] == -color)
            return false;
        colors[current] = color;
        for (int other: graph[current]) {
            if (colors[other] == color)
                return false;
            if (colors[other] == 0)
                if (!dfs(graph, other, colors, -color))
                    return false;
        }
        return true;
    }
   
}
