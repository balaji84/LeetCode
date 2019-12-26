public class Solution {
    public int braces(String A) {
        
        Stack<Character> st = new Stack<Character>();
        String token = "+-*/";
        for(char ch : A.toCharArray()){
            if(ch == ')'){
                
                char top = st.pop();
                boolean isexist = true;
                while(top!='(')
                {
                    if(token.indexOf(top)!=-1)isexist = false;
                    top = st.pop();
                }
                
                if(isexist){
                    return 1;
                }
            }else{
                st.push(ch);
            }
        }
        
        return 0;
    }
}
