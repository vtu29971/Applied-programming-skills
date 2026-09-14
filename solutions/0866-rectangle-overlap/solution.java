class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

// it's for rec1 , 
        int x1 = rec1[0];
        int y1 = rec1[1];
        int x2 = rec1[2];
        int y2 = rec1[3];
//   for rec2 --
        int p1 = rec2[0];
        int q1 = rec2[1];
        int p2 = rec2[2];
        int q2 = rec2[3];


// for points p1, q1 in btwn x1 y1 & x2 y2 .
        return Math.max(x1, p1) < Math.min(x2, p2) &&
               Math.max(y1, q1) < Math.min(y2, q2);
    }
}
