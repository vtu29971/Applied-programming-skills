class Solution {
    public int myAtoi(String s) {
        s = s.strip();

        int a = 1; 
        int i = 0;
        long rs = 0;

        if(s.length() == 0){
            return 0;
        } 

        if(s.charAt(0) == '-'){
            a = -1;
            i++;
        }
        else if(s.charAt(0) == '+') i++;
    

        //now we will while + break

        while(i < s.length()){
            char c = s.charAt(i);
            if(c < '0' || c > '9'){
                break;
            }

            rs = rs*10 + (c - '0');
            if(a * rs > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if(a * rs < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(a*rs);


    }
}
