flow: used for  &&
===================

      boolean isIsland = (dfs(grid, i-1,j, visited) &&
        dfs(grid, i+1,j, visited) &&
        dfs(grid, i,j-1, visited) && //if && it breaks when false now it runs all 4 cases
        dfs(grid, i,j+1, visited));
        
     
   logs:
   ====
     
              ===Solution.closedIsland():i :0 j:0
           Solution.dfs():i:0 j:0
           Solution.dfs():i:-1 j:0
      ===Solution.closedIsland():i :0 j:1
           Solution.dfs():i:0 j:1
           Solution.dfs():i:-1 j:1
      ===Solution.closedIsland():i :0 j:4
           Solution.dfs():i:0 j:4
           Solution.dfs():i:-1 j:4
      ===Solution.closedIsland():i :0 j:6
           Solution.dfs():i:0 j:6
           Solution.dfs():i:-1 j:6
      ===Solution.closedIsland():i :0 j:7
           Solution.dfs():i:0 j:7
           Solution.dfs():i:-1 j:7
      ===Solution.closedIsland():i :0 j:9
           Solution.dfs():i:0 j:9
           Solution.dfs():i:-1 j:9
      ===Solution.closedIsland():i :1 j:2
           Solution.dfs():i:1 j:2
           Solution.dfs():i:0 j:2
           Solution.dfs():i:2 j:2
           Solution.dfs():i:1 j:1
           Solution.dfs():i:1 j:3
      :count:1
      ===Solution.closedIsland():i :1 j:5
           Solution.dfs():i:1 j:5
           Solution.dfs():i:0 j:5
           Solution.dfs():i:2 j:5
           Solution.dfs():i:1 j:5
           Solution.dfs():i:3 j:5
           Solution.dfs():i:2 j:5
           Solution.dfs():i:4 j:5
           Solution.dfs():i:3 j:5
           Solution.dfs():i:5 j:5
           Solution.dfs():i:4 j:4
           Solution.dfs():i:3 j:4
           Solution.dfs():i:2 j:4
           Solution.dfs():i:4 j:4
           Solution.dfs():i:3 j:3
           Solution.dfs():i:2 j:3
           Solution.dfs():i:4 j:3
           Solution.dfs():i:3 j:3
           Solution.dfs():i:5 j:3
           Solution.dfs():i:4 j:2
           Solution.dfs():i:3 j:2
           Solution.dfs():i:5 j:2
           Solution.dfs():i:4 j:2
           Solution.dfs():i:6 j:2
           Solution.dfs():i:5 j:1
           Solution.dfs():i:5 j:3
           Solution.dfs():i:4 j:1
           Solution.dfs():i:3 j:1
           Solution.dfs():i:5 j:1
           Solution.dfs():i:4 j:0
           Solution.dfs():i:3 j:0
           Solution.dfs():i:2 j:0
           Solution.dfs():i:4 j:0
           Solution.dfs():i:3 j:-1
      ===Solution.closedIsland():i :1 j:9
           Solution.dfs():i:1 j:9
           Solution.dfs():i:0 j:9
           Solution.dfs():i:2 j:9
           Solution.dfs():i:1 j:9
           Solution.dfs():i:3 j:9
           Solution.dfs():i:2 j:8
           Solution.dfs():i:2 j:10
      ===Solution.closedIsland():i :2 j:1
           Solution.dfs():i:2 j:1
           Solution.dfs():i:1 j:1
           Solution.dfs():i:3 j:1
           Solution.dfs():i:2 j:0
           Solution.dfs():i:2 j:2
      :count:2
      ===Solution.closedIsland():i :2 j:6
           Solution.dfs():i:2 j:6
           Solution.dfs():i:1 j:6
           Solution.dfs():i:3 j:6
           Solution.dfs():i:2 j:6
           Solution.dfs():i:4 j:6
           Solution.dfs():i:3 j:5
           Solution.dfs():i:3 j:7
           Solution.dfs():i:2 j:5
           Solution.dfs():i:2 j:7
      :count:3
      ===Solution.closedIsland():i :3 j:8
           Solution.dfs():i:3 j:8
           Solution.dfs():i:2 j:8
           Solution.dfs():i:4 j:8
           Solution.dfs():i:3 j:7
           Solution.dfs():i:3 j:9
      :count:4
      ===Solution.closedIsland():i :4 j:9
           Solution.dfs():i:4 j:9
           Solution.dfs():i:3 j:9
           Solution.dfs():i:5 j:9
           Solution.dfs():i:4 j:8
           Solution.dfs():i:4 j:10
      ===Solution.closedIsland():i :5 j:0
           Solution.dfs():i:5 j:0
           Solution.dfs():i:4 j:0
           Solution.dfs():i:6 j:0
           Solution.dfs():i:5 j:-1
      ===Solution.closedIsland():i :5 j:4
           Solution.dfs():i:5 j:4
           Solution.dfs():i:4 j:4
           Solution.dfs():i:6 j:4
           Solution.dfs():i:5 j:3
           Solution.dfs():i:5 j:5
      :count:5
      ===Solution.closedIsland():i :5 j:6
           Solution.dfs():i:5 j:6
           Solution.dfs():i:4 j:6
           Solution.dfs():i:6 j:6
           Solution.dfs():i:5 j:6
           Solution.dfs():i:7 j:6
           Solution.dfs():i:6 j:6
           Solution.dfs():i:8 j:6
           Solution.dfs():i:7 j:6
           Solution.dfs():i:9 j:6
           Solution.dfs():i:8 j:6
           Solution.dfs():i:10 j:6
      ===Solution.closedIsland():i :6 j:1
           Solution.dfs():i:6 j:1
           Solution.dfs():i:5 j:1
           Solution.dfs():i:7 j:1
           Solution.dfs():i:6 j:0
           Solution.dfs():i:6 j:2
      :count:6
      ===Solution.closedIsland():i :6 j:3
           Solution.dfs():i:6 j:3
           Solution.dfs():i:5 j:3
           Solution.dfs():i:7 j:3
           Solution.dfs():i:6 j:2
           Solution.dfs():i:6 j:4
      :count:7
      ===Solution.closedIsland():i :6 j:7
           Solution.dfs():i:6 j:7
           Solution.dfs():i:5 j:7
           Solution.dfs():i:7 j:7
           Solution.dfs():i:6 j:7
           Solution.dfs():i:8 j:7
           Solution.dfs():i:7 j:6
           Solution.dfs():i:7 j:8
           Solution.dfs():i:6 j:8
           Solution.dfs():i:5 j:8
           Solution.dfs():i:7 j:8
           Solution.dfs():i:6 j:7
           Solution.dfs():i:6 j:9
           Solution.dfs():i:8 j:8
           Solution.dfs():i:7 j:8
           Solution.dfs():i:9 j:8
           Solution.dfs():i:8 j:7
           Solution.dfs():i:8 j:9
           Solution.dfs():i:7 j:7
           Solution.dfs():i:7 j:9
           Solution.dfs():i:6 j:9
           Solution.dfs():i:8 j:9
           Solution.dfs():i:7 j:8
           Solution.dfs():i:7 j:10
      ===Solution.closedIsland():i :8 j:3
           Solution.dfs():i:8 j:3
           Solution.dfs():i:7 j:3
           Solution.dfs():i:9 j:3
           Solution.dfs():i:8 j:3
           Solution.dfs():i:10 j:3
      ===Solution.closedIsland():i :8 j:4
           Solution.dfs():i:8 j:4
           Solution.dfs():i:7 j:4
           Solution.dfs():i:9 j:4
           Solution.dfs():i:8 j:3
           Solution.dfs():i:8 j:5
      :count:8
      ===Solution.closedIsland():i :9 j:9
           Solution.dfs():i:9 j:9
           Solution.dfs():i:8 j:9
           Solution.dfs():i:10 j:9
      Solution.main()8

        
        
        
    flow for &
    ==========
    
        boolean isIsland = (dfs(grid, i-1,j, visited) &
        dfs(grid, i+1,j, visited) &
        dfs(grid, i,j-1, visited) & //if && it breaks when false now it runs all 4 cases
        dfs(grid, i,j+1, visited));
        




