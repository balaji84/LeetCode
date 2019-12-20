public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
                ArrayList<Integer> result = new ArrayList<Integer>();

        int r = A.size();
        if(r==0||r==0||A.get(0).size()==0)return result;
        int c = A.get(0).size();
        
        int left=0;
        int right =c;
        int top =0;
        int bottom = r;
        while(left<right || top<bottom){
            
            if(top<bottom){
                for(int i =left;i<right;i++){
                    result.add(A.get(top).get(i));
                }
            }
            top++;
            
            if(left<right){
                for(int i =top;i<bottom;i++){
                    result.add(A.get(i).get(right-1));
                }
            }
            right --;
            
            if(top<bottom){
                for(int i =right-1;i>=left;i--){
                    result.add(A.get(bottom-1).get(i));
                }
            }
            bottom--;
            
            if(left<right){
                for(int i =bottom-1;i>=top;i--){
                    result.add(A.get(i).get(left));
                }
            }
            left++;
        }
        
        return result;
            
        
    }
}
