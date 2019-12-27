public class Solution {
    public String countAndSay(int A) {
        
        String result = "1";
        
        if(A<1)return "";
        
        for(int i =1;i<A;i++){
            result = findCount(result);
        }
        
        return result;
    }
    
    private String findCount (String s ){
        
        //All based on previous val
        //1
        //11 
        //21 -2(1's) and 1 (1's)
        //1211
        //111221
        //312211
        //13112221 -1 (3's)1 1's, 2 (2's) , 2 (1's)
        //1113213211

        char c = s.charAt(0);
        int count =1;
        StringBuilder builder = new StringBuilder();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==c){
                count ++ ;
            }else{
                builder.append(count);
                builder.append(c);
                count =1;
                c= s.charAt(i);
            }
        }
        builder.append(count);
        builder.append(c);
        
        return builder.toString();
    }
    
    
}
