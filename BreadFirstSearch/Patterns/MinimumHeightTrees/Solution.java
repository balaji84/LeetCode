class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<Integer>();
        int degree[] = new int[n];
        
                    int len = edges.length;

        List[] list= new ArrayList[n];
        if(len==0){
            result.add(0);
            return result;
        }
        for(int i=0;i<n;i++){
            list[i]= new ArrayList();    
        }
        

        for(int i=0;i<len;i++){
            list[edges[i][0]].add(edges[i][1]);  
            list[edges[i][1]].add(edges[i][0]);  
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            degree[i]=list[i].size();
            if(degree[i]==1){
                queue.offer(i);
            }
        }
        
       
        int layer = n;
        
        while(layer>2){
            int size = queue.size();
            layer-=size;
            for(int i=0;i<size;i++){
                 int top =     queue.poll();
                for( int val : (ArrayList<Integer>)list[top]){
                    degree[val]--;
                    if(degree[val]==1){
                        queue.offer(val);
                    }
                }
            }            
        }
        
        result.addAll(queue);
        
        return result;
    }
}
