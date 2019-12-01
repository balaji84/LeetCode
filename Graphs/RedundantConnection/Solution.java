class Solution {
    public int[] findRedundantConnection(int[][] edges) {
     
        int len = edges.length;
        int parent[] = new int[len*2];
        UF uf = new UF(parent);
        
        int result[] = new int[2];
        for(int edge[]: edges){
            int x = edge[0];
            int y = edge[1];
            if(!uf.union(x,y)){
                
                result[0]=x;
                result[1]=y;
                return result;
            }
        }
        return result;
    }
}

class UF{
    
    int parent[];
    UF(int parent[]){
        this.parent = parent;
        int len = parent.length;
        System.out.println(len);
        for(int i=0;i<len;i++){
            parent[i]= i;
        }
    }
    
    
     boolean union(int x, int y){
       if(find(x)==find(y)){
           return false;
       }
        
        parent[find(x)] = find(y);
        return true;
    }
    
    private int find(int x){
         while(x!=parent[x]){
            x=parent[x];
        }
        return x;
    }
}
