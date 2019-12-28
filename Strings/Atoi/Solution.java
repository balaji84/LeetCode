public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
        
        if(A.equals("")) return 0;
        
        int sign = 1;

        String s= A;
        
        s = s.trim();
        char sbit = s.charAt(0);
        int i =0;
        if(sbit=='-'){
            sign = -1;
            i++;
        }else if(sbit=='+'){
            sign = 1;
            i++;
        }
       
        int res =0;

        s = s.trim();
         int len = s.length();
        while(i<len && Character.isDigit(s.charAt(i))){
            int d = s.charAt(i)-'0';
            //421
            if(res > ((Integer.MAX_VALUE - d)/10)){
                return sign>=0 ? Integer.MAX_VALUE :Integer.MIN_VALUE;
            }
            res =   res*10 + d;
            i++;
        }
        
        return res *sign;
    }
}
