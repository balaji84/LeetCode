1)you can use visited array to track of visited grid or you can use inplace changes like change
the value to '*' and before dfs check whether value is not * if so return there itself and not 
allow dfs recursion.

2) use visited flag if you are going to use existing arr and do changes in the array and return 
in place edit without using extra array or memory or variables i.e using existing arr do changes and return . then use visited flag.
if they ask the count , you can change existing array then dont use visited flag do changes in array
like change visited value in matrix or arr to some value like '*' and have base case to ignore revisit with value '*'.
