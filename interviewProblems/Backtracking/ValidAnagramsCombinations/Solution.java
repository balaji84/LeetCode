public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        
        //cat dog god tca
        
        //cat - 
        //dog -
        //god -
        //tca - 
        int len = A.size()-1;
        HashMap<String,LinkedList<Integer>> map = new HashMap<>();
        for(int i=0;i<=len;i++)
        {
            
            String word = A.get(i);
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String  key = new String(arr);
            map.computeIfAbsent(key, k->new LinkedList<Integer>());
             map.get(key).add(i+1);
        }
      
       // System.out.println(map);
        
        
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
         for(List<Integer> val : map.values()){
             ArrayList<Integer> list =new ArrayList<Integer>();
             for(int i: val){
                list.add(i);
             }
             result.add(list);
             
         }
        
        return result;
    }
}
