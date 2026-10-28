class Solution {
    public int minCost(int[][] grid) {
        int rlen = grid.length;
        int clen = grid[0].length;

        boolean[][][] dp = new boolean [rlen][clen][1024];

        dp[0][0][grid[0][0]] = true;  //Whatever's the first postion of the grid , at that positional index , we are keeping the cell value in the dp boolean array as true

        for(int i = 0 ; i < rlen ; i++){
            for(int j = 0 ; j < clen ; j++){
                for(int k = 0 ; k < 1024 ; k++){

                    if(!dp[i][j][k]) continue; // If the value at dp i,j,k is false , then there will be no branching out for optimization sake 

                    //At last in the end , whe just need the 1 path at minimum

                    if(j+1 < clen){   //That is if the operation is allowed , indication an operation in the next column .

                    dp[i][j+1][k^grid[i][j+1]] = true;

                    // We update the XOR value at the next iterative index to TRUE as to say that in the next iteration , branching with that cell is possible

                    }

                    if(i+1 < rlen){   //That is if the operation is allowed , indication an operation in the next row .

                    dp[i+1][j][k^grid[i+1][j]] = true;

                    // Similarly as above

                    }
                }
            }
        }

        //After the completion of the whole looping statement
        //We check and return the minimum k value;

        for(int k = 0 ; k < 1024 ; k++){
            if(dp[rlen-1][clen-1][k]) return k;

            // You see this is a 3d matrix , 
            // So why are we checking the value at specifically n-1 row , m-1 column is as at every step , we have proceeded to store values at each possible indices , hence the xor values of all the calculations will finally and aboslutely accumulate somewhere along the lines of the kth depth , hence we are only searching at the resultant row , column for lowest possible k cell index;
        }

        return -1;
    }
}
