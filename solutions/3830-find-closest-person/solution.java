class Solution {
    public int findClosest(int x, int y, int z) {
        int X = Math.abs(x-z);
        int Y = Math.abs(y-z);

        if(X < Y) return 1;
        else if(X > Y) return 2;
        else return 0;
    }
}
