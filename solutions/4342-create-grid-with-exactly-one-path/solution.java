class Solution {
    public String[] createGrid(int m, int n) {

        String[] r = new String[m];

        
        for(int i = 0 ; i < m ; i++){
        StringBuilder s = new StringBuilder();

            for(int j = 0 ; j < n ; j++){
                if(i == 0){
                    s.append(".");
                }
                else if ( j == n-1){
                    s.append(".");
                }
                else{s.append("#");}
                
            }

            r[i] = s.toString();

        }
        return r;
    }
}
