class Solution {
    public boolean isSubsequence(String s, String t) {
        // Edge case -- 
        if(s.isEmpty()) return true ; 

        int i  = 0 , j = 0;

        int count = 0 ;

        while( i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
// doing i++ as if we see that s.charAt[i] is equivalent then atlast we are gonna compare s.length with count and see if they were equal or not
                    i++;
            }
            j++;
        }
        return i == s.length();
    }
}
