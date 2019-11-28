///Runtime: 11 ms, faster than 96.12% of Java online submissions for Minimum Height Trees.
//Memory Usage: 47.8 MB, less than 94.44% of Java online submissions for Minimum Height Trees.

//Input: n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]

//     0  1  2
//      \ | /
//        3
//        |
//        4
//        |
//        5 


//[3,4]

//idea is cut leaf nodes. 

//[0] -  [3]
//[1] -  [3]
//[2] -  [3]
//[3] -  [0,1,2,4]
//[4] -  [3,5]
//[5] -  [4]

//layer 1 cut leaves i.e which do not have any child 
//since 0 ,1,2,5 has one in list so leave nodes so never can be parent.   
//After cut these leaves (0 ,1,2,5) size of tree is 2  so minimum 2 required to form parent child
//trees (a->b) so these 2 are minimum height tree.
//[3]- [4]
//[4]- [5]
//finally 
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
