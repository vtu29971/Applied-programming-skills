class Solution {
    public int reverse(int x) {

        int rem = 0;
        int qt = 0;
        int y = x;

         if((x % 10) == 0){
            x = x/10;
        }

        while(y != 0){

            //Upper bound checking
            if (qt > Integer.MAX_VALUE / 10 || (qt == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            
            // Lower Bound Check
            if (qt < Integer.MIN_VALUE / 10 || (qt == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rem = y%10;
            qt = (qt*10)+rem;
            y = y / 10;

        }
        return qt;
    }
}
