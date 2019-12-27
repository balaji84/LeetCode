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
                    //since it traverse whole length of string of target
                    return i- tlen+1;
                }
                
                str="";
                count =0;
                //bbaba //baba since it traverse till band since does
                //match reset to bb(index) i.e minus the length it traverse
                //and found not match.
                //now b(baba) matches
                i = i-tlen+1;
                //rest to next index 
            }
        }   
        
        return -1;
    }
}
