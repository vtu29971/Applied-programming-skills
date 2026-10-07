class Solution {
    private Set<String> st = new HashSet<>();
    private int n;
    private int maxLen;

    private void solve (String s , int i , StringBuilder curr , int count ){
        //terminating condition for Recursion

        if(count < 0 ){
            return;
        }

        //if the whole string has been traversed successfully then

        if(i == n){

            //if string valid

            if(count == 0){

                //on fly checking for min parentheses removed string

                if(curr.length() > maxLen){
                    maxLen = curr.length();
                    st.clear();

                    //now as stack is clear , we will insert only those string with min changes
                }

                //adding new to set
                if(curr.length() == maxLen){
                    st.add(curr.toString());
                    
                }
            }
            return;
        }


        //The code for letters , we need to always keep them 

        char c = s.charAt(i);
        if(c!= '('  && c != ')'){
            curr.append(c);
            solve(s , i+1 , curr, count);
            curr.deleteCharAt(curr.length() - 1);
            return;
        }

        //From here iterating and recursion implementation

        curr.append(c);

        //Exploration part
        solve(s, i+1 , curr, count+(c == '(' ? 1 : -1));

        //Undo & explore ( need to focus on the question at this part later)

        curr.deleteCharAt(curr.length() - 1);
        solve(s, i+1 , curr , count);
    }
    
    public List<String> removeInvalidParentheses(String s) {
        
        n = s.length();

        maxLen = 0;

        st.clear();

        solve(s , 0 , new StringBuilder() , 0);

        return new ArrayList<>(st);


        
    }
}
