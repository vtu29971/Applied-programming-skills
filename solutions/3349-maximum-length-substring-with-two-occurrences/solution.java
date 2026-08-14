class Solution {
    public int maximumLengthSubstring(String s) {
        int maxlength = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            int[] f = new int[26];
            for(int j = i ; j < s.length() ; j++){
            f[s.charAt(j) -'a']++;
            if(f[s.charAt(j) -'a']>2){break;} 
            maxlength = Math.max(maxlength,j-i+1);
            
            
                }
            }
        return maxlength;
    }
   
}
