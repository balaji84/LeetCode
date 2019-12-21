public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B) {
        
        //{1 0 -1 0 -2 2},
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int len = A.size();

        //sort collections.
        if(A==null||A.size()<4)return result;
        
        Collections.sort(A);
        
      
        //if we have multiple if conditions and we are selecting range
        //based on previous one like i=0; j=i+1 ,z=i+1 it is good to avoid
        //<= since at some point some values fall in to 2 ranges and creates duplicate.
        
        
        //eg. below
        //-8 36 23 -15
        //if i<=len-3
        
        //pass 1
          //-8
          //36
          //23, -15
          
          
          //pass2 
         // 36 23 -15(len==3)
         //i<=len-3 will cause
         //36 to be selected.
         //3
          
          
        //full traversal  
            // [ 29, 10, -16, -7, 21, 17, 6, -8, 36, 23, -15 ] ,target=52
        //pass 1
            //29(select 1)
            // 10 (select 1)
            //-16, -7, 21, 17, 6, -8, 36, 23, -15(select 2)
        
        //pass 2
           //10
            //-16
            // -7, 21, 17, 6, -8, 36, 23, -15
            
        //pass 3
          //-16
          //-7
          // 21, 17, 6, -8, 36, 23, -15
        //pass 4
          //21
          //17
          //6, -8, 36, 23, -15
        //pass 5
          //17
          //6
          //-8, 36, 23, -15
        //pass 6
          //6
          //-8
          //36, 23, -15
          
        //pass 7
          //-8
          //36
          //23, -15
            
          
          
        for(int i=0;i<len-3;i++){
            //if left selection both are same.
            if(i!=0 && A.get(i)==A.get(i-1)) continue;
            
            for(int j=i+1;j<len-2;j++){
                //if left selection both are same.
                //exclude j start value
                if(j!=i+1 && A.get(j)==A.get(j-1)) continue;
                int low = j+1;
                int high = len-1;
                while(low<high){
                     ArrayList<Integer> list =new ArrayList<Integer>();

                    int p1 = A.get(i);
                    int p2 = A.get(j);
                    int p3 = A.get(low);
                    int p4 = A.get(high);
                    int sum = p1 + p2 + p3 + p4;
                     if(sum<B){
                        low++;
                    }else if(sum>B){
                        high--;
                    }else{
                         list.add(p1);
                        list.add(p2);
                        list.add(p3);
                        list.add(p4);
                        
                        if(!result.contains(list))
                         result.add(list);
                        low++;
                        high--;
                        
                        while(low<high && A.get(high+1 )==A.get(high)) high--;
                         while(low<high && A.get(low-1 )==A.get(low)) low++;
                    
                    }
                }
            }
        }
        return result;
    }
}
