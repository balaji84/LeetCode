class Solution {
    public int minSwapsCouples(int[] row) {
        int res = 0, N = row.length;
    
        int[] ptn = new int[N];    
        int[] pos = new int[N];

        for (int i = 0; i < N; i++) {
            ptn[i] = (i % 2 == 0 ? i + 1 : i - 1);
            pos[row[i]] = i;
        }
        
        //i   -0 1 2 3
        //row -3 2 0 1
        //ptn -1 0 3 2  - split in to 2 pairs
        //pos -2 3 1 0
    
        for (int i = 0; i < N; i++) {
            int j= ptn[pos[ptn[row[i]]]];
            while(i!=j){
                swap(row, i, j);
                swap(pos, row[i], row[j]);
                res++;
                j= ptn[pos[ptn[row[i]]]];
            }
        }
    
    return res;
  }
    
    private void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
