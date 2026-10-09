class Solution {
    public int minInsertions(String s) {
        int result = 0 , count = 0 , i = 0;

        while(i < s.length()){
            //First we will check for the ( bracket iteration)
            if(s.charAt(i) == '('){
                count++;
                i++;
            }
            else{
                //automatically it falls upon )
                if(count > 0){
                    count--;
                }
                else{
                    result++;
                }

                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    i+= 2;
                }
                else{
                    result++;
                    i++;
                }
            }
        }

        return result + count * 2;
    }
}
