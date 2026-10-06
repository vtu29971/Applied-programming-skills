class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        int count = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }
            else if(!(stack.isEmpty()) && stack.peek() == '('){
                stack.pop();
            }
            else{stack.push(c);}
        }
        while(!(stack.isEmpty())){
            stack.pop();
            count++;

        }
        return count;
    }
}
