class Solution {
    public int scoreOfParentheses(String s) {

        int score = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == '('){
                stack.push(score);
                score = 0;
            }
            else{
                    if(s.charAt(i-1) == '('){
                        score = stack.peek()+1;
                    }
                    else{
                        score = stack.peek() + score*2;
                    }
             stack.pop();
            }
        }

        return score;
    }
}
