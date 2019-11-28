class Solution {
     public boolean isBipartite(int[][] g) {
       int[] colors = new int[g.length];
         
         
        for (int i = 0; i < g.length; i++){
            if (colors[i] == 0) {
              if(!bfs(g,colors,i)) return false;
            }
        }
        return true;
    }
    
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
   
}
