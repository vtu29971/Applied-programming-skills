class Solution {
    public int longestValidParentheses(String s) {

        int result = 0;
        int open = 0;
        int close = 0;
        

        //Left to Right

        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                result = Math.max(result , open+close);
            }
            else if(close > open){
                open = 0;
                close = 0;
            }
        }

        open = 0 ;
        close = 0 ;

        for(int i = s.length()-1 ; i >= 0 ; i--){
            
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                result = Math.max(result , open+close);
            }
            else if(close < open){
                open = close = 0;
            }
        }
        return result;
    }
}
