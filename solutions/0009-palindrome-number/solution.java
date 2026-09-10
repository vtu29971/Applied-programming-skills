class Solution {
    public boolean isPalindrome(int x) {

        int newnum = 0;
        int rem = 0;
        int y = x;


        if(x  < 0){
            return false;
        }


        while(y != 0){
        newnum *= 10;
        rem = y % 10;
        newnum  +=  rem ;
        y = Math.floorDiv(y , 10);
        }

        System.out.println(newnum);

        return newnum == x;
    }
}
