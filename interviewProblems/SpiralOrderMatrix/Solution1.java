public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
                 ArrayList<Integer> result = new ArrayList<Integer>();

        int len = A.size();
        if(len ==0 || A.get(0).size()==0) return result;
        
        int r = len;
        int c= A.get(0).size();
        
         int top =0;
         int left =0;
         int right = c-1;//column
         int bottom = r-1;//row.
         int count =0;
         while(result.size()<r*c){
           //  System.out.println("count:"+count);
             for(int i =left;i<=right;i++){
                 result.add(A.get(top).get(i));
             }
             top++;//since next iteration next row be will taken.
             
             //input
               //[1, 2]
               //[3, 4]
               //[5, 6]

             //1 2 4 3 

             //here itneeds bottom +1 otherwise last row gets truncated.
             //so use top<bottom and remove -1 in row and col.
             for(int i =top;i<=bottom;i++){ 
                 //since column iterator right is used
                 result.add(A.get(i).get(right));
             }
             right --;
             
             if(bottom<top)break;
             
             for(int i =right;i>=left;i--){
                 result.add(A.get(bottom).get(i));
             }
             bottom--;
             
             if(right<left)break;

             for(int i =bottom;i>=top;i--){
                 result.add(A.get(i).get(left));
             }
             left++;//increment left to start next level(next row,column 1)
             
         }
         
         return result;
    }
}
