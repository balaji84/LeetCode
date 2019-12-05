package sample;

class Solution {
    public int closedIsland(int[][] grid) {
        
        
        // 0 sorrounded by 1 is 1 count;
        
        int r = grid.length;
        int c = grid[0].length;
        boolean visited[][] = new boolean[r][c];
        
        int count = 0;
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
                if(grid[i][j]==0  && i==8 && j==3){
                	System.out.println("===Solution.closedIsland():i :"+i +  " j:"+j);
                    if(dfs(grid, i, j ,visited )){
                        count++;
                        System.out.print(":count:"+count+"\n");
                    }
                     
                }
            }
        }
        
        return count ;
    }
    
    
//		    
//			0	1	2	3	4	5	6	7	8	9
//    ==================================================
//		0 |	0	0	1	1	0	1	0	0	1	0
//		1 |	1	1	0	1	1	0	1	1	1	0
//		2 |	1	0	1	1	1	0	0	1	1	0
//		3 |	0	1	1	0	0	0	0	1	0	1
//		4 |	0	0	0	0	0	0	1	1	1	0
//		5 |	0	1	0	1	0	1	0	1	1	1
//		6 |	1	0	1	0	1	1	0	0	0	1
//		7 |	1	1	1	1	1	1	0	0	0	0
//		8 |	1	1	1	0	0	1	0	1	0	1
//		9 |	1	1	1	0	1	1	0	1	1	0
//												

    //output when uses && operator
    
//    ===Solution.closedIsland():i :8 j:3
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:7 j:3
//   		 Solution.dfs():i:9 j:3
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:10 j:3
//   ===Solution.closedIsland():i :8 j:4
//   		 Solution.dfs():i:8 j:4
//   		 Solution.dfs():i:7 j:4
//   		 Solution.dfs():i:9 j:4
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:8 j:5
//   :count:8
    
//    ===Solution.closedIsland():i :9 j:9
    
    //output when uses & operator , as you can see it avoid (8,4) to gets through it 
    //makes as visited i.e grid[i][j]==1 at the (8,3) failure case itself so it wont get visited.
//    
//    ===Solution.closedIsland():i :8 j:3
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:7 j:3
//   		 Solution.dfs():i:9 j:3
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:10 j:3
//   		 Solution.dfs():i:9 j:2
//   		 Solution.dfs():i:9 j:4
//   		 Solution.dfs():i:8 j:2
//   		 Solution.dfs():i:8 j:4
//   		 Solution.dfs():i:7 j:4
//   		 Solution.dfs():i:9 j:4
//   		 Solution.dfs():i:8 j:3
//   		 Solution.dfs():i:8 j:5
//  :count:5
//    ===Solution.closedIsland():i :9 j:9
//   		 Solution.dfs():i:9 j:9

    private boolean dfs(int grid[][] , int i, int j, boolean[][] visited){
        
        int r = grid.length;
        int c = grid[0].length;
        System.out.println("\t\t Solution.dfs():i:"+i + " j:"+j);
        if(i<0 || j<0 ||i>=r || j>=c){

            return false;
        }
        
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
       visited[i][j]= true;
       //since need to run all cases left, right,top,bottom
       //regardless of true or false.
        boolean isIsland = (dfs(grid, i-1,j, visited) &
        dfs(grid, i+1,j, visited) &
        dfs(grid, i,j-1, visited) & //if && it breaks when false now it runs all 4 cases
        dfs(grid, i,j+1, visited));
        
        return isIsland;
    }
    
    
    //
    
    public static void main(String args[]) {
		int grid[][] = { { 0, 0, 1, 1, 0, 1, 0, 0, 1, 0 }, { 1, 1, 0, 1, 1, 0, 1, 1, 1, 0 },
				{ 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 }, { 0, 1, 1, 0, 0, 0, 0, 1, 0, 1 }, { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 },
				{ 0, 1, 0, 1, 0, 1, 0, 1, 1, 1 }, { 1, 0, 1, 0, 1, 1, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 0, 0 },
				{ 1, 1, 1, 0, 0, 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0 } };
    	int result = new Solution().closedIsland(grid);
    	System.out.println("Solution.main()"+result);
    	
    }
}
