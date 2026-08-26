class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        int n = s.length();

        for(int len = k ; len <= s.length() ; len++){

            String reslt = "";

            for(int i = 0 ; i <= n-len ; i++){
                String substr = s.substring(i , i+len );

                int ones = 0;
                for(char a : substr.toCharArray()){
                    ones += (a == '1') ? 1 : 0;
                }
                if(ones == k){
                    if(reslt.isEmpty() || substr.compareTo(reslt) < 0){
                        reslt = substr;
                    }
                }
            }
        if(!(reslt.isEmpty())){
        return reslt;}
        }
return "";}
}
