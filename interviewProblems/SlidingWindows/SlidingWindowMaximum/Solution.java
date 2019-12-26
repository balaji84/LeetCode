public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        
        //    A = [1, 3, -1, -3, 5, 3, 6, 7]
        //    B = 3
        
        //[1,  3,-1] - 3
        //[3, -1,-3] - 3
        //[-1,-3, 5] - 5
        //[-3, 5, 3] - 5
        //[5,  3, 6] - 6
        //[3,  6, 7] - 7
        
        //1, 3, -1, -3, 5, 3, 6, 7
        //|------|
        //   |-------|
        //      |-------|
        //          |------|
        //             |------|
        //                |------|
        
        //n - 8
        //total of sliding needed - (n-k+1) =8-3+1 = 6
        int k = B;
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayDeque<Integer>  queue = new ArrayDeque<Integer>();
        int n = A.size();
     
        //push till size is B
        for(int i =0;i<n;i++){
            
               // int val = A.get(i);
                //if queue contains elements less than current
                //index queue
                //current running queue - (i-k+1)
                //i.e  for index 1 [3, -1, -3]  1-3+1=3 so i<3
                //which is 2 is the index of previous queue.
                // for 6 [3, 6, 7] - 6-3+1 -4 so  4 is the previous queue
                //last index
                while(!queue.isEmpty() && queue.peekFirst()<i-k+1){
                    queue.pollFirst();
                }
                
                //remove if current val >=previous value
                //remove last value to maintain maximum value at front.
                while(!queue.isEmpty() && A.get(i)>= A.get(queue.peekLast())){
                    queue.pollLast();
                }
                //step 1: add to queue.
                queue.add(i);
                //step 2: After adding if it exceeds or equal current window max.
                if(i>=k-1){//current queue last value
                    result.add(A.get(queue.peekFirst()));//since first is maximum
                }
                
        }

            return result;
    }
}
