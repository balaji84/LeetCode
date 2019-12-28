public class Solution {
    public int romanToInt(String A) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        
        map.put('I',1);

        map.put('V',5);
        map.put('X',10);
        
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        Stack<Integer> st = new Stack<Integer>();
        int len = A.length();
        
        
        //X-10
        //L-50
        //XL-40
        for(int i=0;i<len;i++){
            int val = map.get(A.charAt(i));
            if(!st.isEmpty() && st.peek()< val){
                st.push(val - st.pop());
            }else{
                st.push(val);
            }
        }
        
        int res =0;
        while(!st.isEmpty()){
            res+=st.pop();
        }
        
        return res;
    }
}
