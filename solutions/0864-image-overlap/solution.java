class Solution {
        int check(int[][] img1, int[][] img2 , int i , int j){
            int n = img1.length;
            int max = 0;
            
            for(int a = 0; a < n ; a++){
                for(int b = 0 ; b < n ; b++){

                    if(a+i >=n || a+i < 0 || b+j >= n || b+j< 0){
                        continue;
                    }
                    if(img1[a][b] == img2[a+i][b+j] && img1[a][b] == 1){
                        max++;
                    }
                    
                }
            }
            return max;
        }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int max = 0;



        for(int rowOf = -n+1 ; rowOf < n ; rowOf++){
            for(int colOf = -n+1 ; colOf < n ; colOf++){

                int val  = check(img1 , img2 , rowOf , colOf);

                max = Math.max(val , max);

            }
        }

        return max;
    }
}
