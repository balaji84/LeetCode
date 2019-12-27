public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String source, final String target) {
    
        String str = "";
        int count = 0;
        int tlen = target.length();
        for(int i=0;;i++){
            for(int j=0;;j++){
                if(j== target.length())return i;
                if(i+j== source.length())return -1;
                if(target.charAt(j)!=source.charAt(i+j)) break;    
            }
        }  
        
    }
}
