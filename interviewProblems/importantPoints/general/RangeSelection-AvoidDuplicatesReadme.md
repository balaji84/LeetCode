4 sum:
======

To Avoid Duplicates:
====================


 //29(select 1) -if previous 2 values of selection are same ignore it to avoid duplicate
 
        //[ 29, 10, -16, -7, 21, 17, 6, -8, 36, 23, -15 ] ,target=52
        //pass 1
            //29(select 1) -if previous 2 values of selection
            // 10 (select 1)
            //-16, -7, 21, 17, 6, -8, 36, 23, -15(select 2)
        
        for(int i=0;i<len-3;i++){
            //if left selection both are same.
            if(i!=0 && A.get(i)==A.get(i-1)) continue;
            for(int j=i+1;j<len-2;j++){
                 if(j!=i+1 && A.get(j)==A.get(j-1)) continue;
            }
        }
        
        
  
  Combination Sum:
  ================
  
   if(i>index && a.get(i-1) == a.get(i))continue; to Avoid duplicates
  
        private void helper(ArrayList<ArrayList<Integer>> result , 
          ArrayList<Integer> a,
          ArrayList<Integer> list,int target,int index ){
              int len = a.size()-1;
              if (target ==0 ){
                              //if(!result.contains(list))
                 result.add(new ArrayList<Integer>(list));
                  return;
              }

              for(int i=index;i<=len;i++){
                  if(i>index && a.get(i-1) == a.get(i))continue;
                  list.add(a.get(i));
                  helper(result,a,list,target - a.get(i), i+1);
                  list.remove(list.size()-1);
              }

          }
