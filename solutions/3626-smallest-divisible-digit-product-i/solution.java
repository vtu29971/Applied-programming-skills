class Solution {
    public int smallestNumber(int number, int t) {
        int a = 0;

        while(true){

        int num = 1;
        int n = number;
        while(n != 0){
            a = n % 10 ;
            num = num*a;
            n = n/10;
        }

        if(num % t  == 0){
            return number;
            
        }
        else{
            number++;
        }
    }
    
    }
}
