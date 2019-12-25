public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int len = A.size();
        int start =0,end =0,zero=0,max =0;
        int maxstart =0,maxend =0;
        while(end < len){
             if(A.get(end)==0){
                 zero++;
             }
             
             while(zero>B){
                 if(start<len && A.get(start)==0){
                     zero--;
                 }
                 start++;
             }
             
             if((end-start+1)>max){
               maxstart = start;
               maxend = end;
                max = end-start+1;
             }
             end++;
        }
        
        for(int i =maxstart ;i<=maxend;i++){
            result.add(i);
        }
        
        
        return result;
    }
}
