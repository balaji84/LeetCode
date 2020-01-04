class Solution {
    public int kSimilarity(String A, String B) {
        
        if(A.equals(B))return 0;
        
        
        LinkedList<String> queue = new LinkedList<String>();
        queue.offer(A);
        
        int layer = 0;
        HashSet<String> visited = new HashSet<String>();
        visited.add(A);
        
        int len = A.length();
        
        while(!queue.isEmpty())
        {
            
            int size = queue.size();
            for(int i=0;i<size;i++){
                String cur = queue.poll();
                if(cur.equals(B))return layer;
                int m =0;
                while(cur.charAt(m)==B.charAt(m))m++;
                
                int j = m;
                for(int z=j+1;z<len;z++){
                    //traverse till we found 2 values changing to shuffle.
                    if(cur.charAt(j)!=B.charAt(z)) continue;
                    String word = getShuffle(cur,j,z);
                    
                    if(visited.contains(word))continue;
                    visited.add(word);
                    queue.offer(word);
                    
                }
            }
            
            layer++;
        }
        
        return -1;
    }
    
    private String getShuffle(String word ,int i,int j){
        char ch[] = word.toCharArray();
        
        char temp = ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        
        return new String(ch);
    }
}
