1) when using nested array like 4 sum where nested loop start from previous loop index +1 better
avoid using <= always use  i<len since mainloop and second loop will collide
      
      int len = a.size()-1;
      for(int i =0;i<=n-3;i++)  //since 1 value select from this remaining 3 from other
      {
         for(int j=i+1;j<=n-2;j++){
           int m= j+1;
           int n =len -1;

         }
       }
       
      //[1 2 3 1 0 6]  target    6
      
      //0 1  2 3 4 5
      //[1 2 3 1 0 6]
      // ----| (loop 1)
      //   ------|(loop 2)
      //     --------|
          
      //n -6
      //first loop 0 - [0 to 3 ]
      //second loop 1 - [1 to 4]
      
      
 
