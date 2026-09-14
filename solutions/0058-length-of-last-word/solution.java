class Solution {
    public int lengthOfLastWord(String s) {
        int len = 0;
        
        s = s.strip();

        for(char a : s.toCharArray()){
            len++;
            if(a == ' '){
                len = 0;
            }
        }
        return len;
    }
}
