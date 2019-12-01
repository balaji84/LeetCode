class Solution {
    public int numSimilarGroups(String[] A) {
        
        HashSet<String> visited = new HashSet<String>();
        
        int count =0;
        for(String s : A){
            if(visited.contains(s)) continue;
            
            count++;
            dfs(s,A,visited);
            
        }
        
        return count;
    }
    
    
    private void dfs(String word1, String[] A,HashSet<String> visited){

        
        visited.add(word1);
        
        for(String word2 : A ){
                  if(visited.contains(word2)) continue;

             int count = getCount(word1,word2);    
            if(count<=2){
                dfs(word2, A,visited);
            }
        }
        
    }
    
    private int getCount(String word1, String word2){
        int count = 0;
        for(int i =0;i<word1.length();i++){
            if(word1.charAt(i) != word2.charAt(i))
            {
                count++;
            }
        }
        
        return count;
    }
}
