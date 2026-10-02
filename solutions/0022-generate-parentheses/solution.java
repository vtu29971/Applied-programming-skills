class Solution {

    public void combine(int n ,String s,int open , int close , List<String> list){

        if(close+open == n*2 ){
            list.add(s);
            return;
        }
        
        if (open < n){
            combine(n , s+"(", open+1 , close , list);
        }
        
        if(close < open){
            combine(n , s+")" , open , close+1 , list);
        }

    }
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        combine(n , "", 0, 0, list);

        return list;
    }
}
