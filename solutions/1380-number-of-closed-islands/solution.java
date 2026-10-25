class Solution {

    private boolean dfs(int[][] g , int r , int c){

        if(r < 0 || c < 0 || r >= g.length || c >= g[0].length){
            return false; // we only give false if out of bound 
        }
        if(g[r][c] == 1){ 
            return true;
        }

        g[r][c] = 1; //Marked visited

        boolean right_closed = dfs(g , r , c+1); //Right
        boolean left_closed = dfs(g , r , c-1); // Left
        boolean up_closed = dfs(g , r-1 , c); // Up
        boolean down_closed = dfs(g , r+1 , c); // Down

        return right_closed && left_closed && up_closed && down_closed ; 

    }
    public int closedIsland(int[][] grid) {
        
        int rlen = grid.length;
        int clen = grid[0].length;
        int count = 0;

        for(int i = 0 ; i < rlen ; i++){
            for(int j = 0 ; j < clen ; j++){

                if(grid[i][j] == 0){
                    if(dfs(grid , i , j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
