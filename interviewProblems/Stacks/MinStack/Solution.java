class Solution {
    
    Stack<Integer> st =new Stack<Integer>();
    Stack<Integer> minst =new Stack<Integer>();
    public void push(int x) {
        //if(st.isEmpty()){
        //}
        st.push(x);
        if(minst.isEmpty()||x<minst.peek()){
            minst.push(x);
        }
    }

    public void pop() {
        if(st.isEmpty()){
           return ; 
        }
        int top = st.pop();
        
        if(top == minst.peek()){
            minst.pop();
        }
        
    }

    public int top() {
        if(st.isEmpty()){
           return -1; 
        }
        
        return st.peek();
    }

    public int getMin() {
        if(minst.isEmpty())return -1;
        
        return minst.peek();
    }
}
