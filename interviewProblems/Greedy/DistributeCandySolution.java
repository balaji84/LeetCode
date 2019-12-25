public class Solution {
    public int candy(ArrayList<Integer> A) {
        
        int len = A.size();
        int arr[] = new int[len];
        Arrays.fill(arr,1);
        //left to right
        for(int i=1;i<len;i++){
            if(A.get(i) > A.get(i-1)){
                arr[i]=arr[i-1]+1;
            }
        }
        //right to left ( last before compare with last)
        for(int i=len-2;i>=0;i--){
            if(A.get(i) > A.get(i+1)){
                arr[i]=Math.max(arr[i], arr[i+1]+1);
            }
        }
        
        int count = 0;
        for(int i=0;i<len;i++){
            count+=arr[i];
        }
        
        return count;
    }
}
