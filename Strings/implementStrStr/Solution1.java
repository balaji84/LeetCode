public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String source, final String target) {
    
        String str = "";
        int count = 0;
        int tlen = target.length();
        for(int i =0;i<source.length();i++){
            str+=source.charAt(i);
            
            count++;
            if(count == tlen){
                if(str.equals(target)){
                    return i- tlen+1;
                }
                
                str="";
                count =0;
            }
        }   
        
        return -1;
    }
}
