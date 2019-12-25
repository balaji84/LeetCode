public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        //A=[1, 2, 1, 3, 4, 3] and K = 3
        // [1, 2, 1]
        // [2, 1, 3]
        // [1, 3, 4]
        // [3, 4, 3]

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int len = A.size();
        int k=B;
        
        //first k input -[1, 2, 1]
        for(int i=0;i<k;i++){
            addToMap(map, A.get(i));
        }
        result.add(map.keySet().size());
        
        //   1 2 1 3 4 3
        //   -----          
        //     -----
        //       -----
        //         ----- (len-k)
        //next k input - [ 2, 1
        
        //  1 2 1 3 4 3
        //   -----          
        //     ----(i+k-1)current window.
        for(int i =1;i<len- k+1;i++) //6-3
        {
            int prevWindowVal = A.get(i-1);
            // (i+3-1)=2 since 1 from prev window so -1;
            int curwindowVal = A.get(i+k-1);
            removeFromMap(map,prevWindowVal);
                        addToMap(map,curwindowVal);


            result.add(map.keySet().size());
        }
        
        return result;
    }
    
    private void addToMap(HashMap<Integer,Integer> map , int val){
         if(map.get(val)!=null){
             map.put(val,map.get(val)+1);
         }else{
             map.put(val,1);
         }
    }
    
    private void removeFromMap(HashMap<Integer,Integer> map , int val){
      if(map.get(val)!=null &&  map.get(val)>1 ){
          //since we have window of size 1 from previous window
                map.put(val, map.get(val)-1);
      }else{
          map.remove(val);
      }
    }
}
