class Solution {

    String Sum(String s , int k){

        StringBuilder n = new StringBuilder();
        int sum = 0;
        int j = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            sum += Character.getNumericValue(s.charAt(i));
            j++;
            if((j == k) || (i == s.length()-1)){
                n.append(Integer.toString(sum));
                System.out.println(n);
                j = 0;
                sum = 0;
            }
        }
        return n.toString();
    }
    public String digitSum(String s, int k) {

        while(s.length() > k){
           s = Sum(s,k);
        }
        return s;
    }
}
