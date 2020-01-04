class Solution {
    public String shortestPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
            
        int i =0;
        while(!isPalindrome(sb)){
            int len = sb.length()-1;//append last character.
            sb.insert(i,sb.charAt(len-i));
            i++;
        }
        
        return sb.toString();
    }
    
    private boolean isPalindrome(StringBuffer sb){
        String s = sb.toString();
        
        int i=0;
        int j = s.length()-1;
        
        while(i<=j){
            if(s.charAt(i++)!=s.charAt(j--))return false;
        }
        
        return true;
    }
}
