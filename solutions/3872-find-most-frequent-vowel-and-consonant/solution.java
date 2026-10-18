class Solution {
    public int maxFreqSum(String s) {
        int len = s.length();

        int maxv = 0;
        int maxc = 0;

        int[] vw = new int[27];
        int[] cn = new int[27];

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                vw[c-'a']++;
            }
            else cn[c-'a']++;

            System.out.println(Arrays.toString(vw) + " " + Arrays.toString(cn));
        }
        for(int i = 0 ; i <= 26  ; i++){
            maxv = Math.max(maxv , vw[i]);
            maxc = Math.max(maxc , cn[i]);
        }
        return maxv+maxc;
    }
}
