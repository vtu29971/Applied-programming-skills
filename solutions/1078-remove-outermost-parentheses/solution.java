class Solution {
    public String removeOuterParentheses(String s) {

        int count = 0;
        StringBuilder newstr = new StringBuilder();
        StringBuilder finalstr = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '(') count++;
            else count--;
            newstr.append(s.charAt(i));

            if(count == 0){
                finalstr.append(newstr.substring(1,newstr.length()-1));
                //Optimized from N*N to N
                newstr.setLength(0); //clearing the leftover 
            }
        }
        return finalstr.toString();
    }
}
