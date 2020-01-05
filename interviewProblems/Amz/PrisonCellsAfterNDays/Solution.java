class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
             //    7  6  5  4  3  2  1  0
        // Day 0: [0, 1, 0, 1, 1, 0, 0, 1] -1+8+16+ 64 =89
        // Day 1: [0, 1, 1, 0, 0, 0, 0, 0] -32+64= 96
        // Day 2: [0, 0, 0, 0, 1, 1, 1, 0] - 2+4+8=14
        // Day 3: [0, 1, 1, 0, 0, 1, 0, 0] -8+32+64=104
        // Day 4: [0, 0, 0, 0, 0, 1, 0, 0] -8
        // Day 5: [0, 1, 1, 1, 0, 1, 0, 0] -4+16+32+64=116
        // Day 6: [0, 0, 1, 0, 1, 1, 0, 0] 
        // Day 7: [0, 0, 1, 1, 0, 0, 0, 0] -16+32=48

        //1+2+4+8+16+32+64+128 =255
                if ( N == 0 ) return cells;
        N = N%14 == 0 ? 14 : N%14;

        int[] newCells = new int[8];

        while (N-- > 0) {
            for (int i = 1; i < 7; i++)
                if (cells[i - 1] == cells[i + 1])
                    newCells[i] = 1;
                else
                    newCells[i] = 0;
            cells = newCells;
            newCells = new int[8];
        }

        return cells;


        
    }
}
