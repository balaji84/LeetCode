public class Solution {
    public String intToRoman(int A) {
        
        //Remember : LCDM
        //      M ,CM,(C)D,C, X(C),L ,(X)L ,I(X)
        // -ending become start for next like XL,L , XC, C, CD,D,CM,M
                          
        String arr[] ={ "M",  "CM","D", "CD", "C","XC", "L","XL","X","IX","V", "IV","I"};
        int val[] ={ 1000,  900,500, 400, 100,90, 50,40,10,9,5, 4,1 };
 
StringBuffer buffer = new StringBuffer();
        for(int i=0;i<val.length;i++){
            while(A>=val[i]){
                A-=val[i];
                buffer.append(arr[i]);
            }
        }
        
        return buffer.toString();
    }
}
