class Solution {
    public int minChanges(String s) {

        int l = s.length();
        int count = 0;
        int finalres = 0;

        for(int i = 1 ; i < l ; i++){
            if(i % 2 == 0){
                finalres += count;
                count = 0;
            }
            else{
                if(s.charAt(i-1) != s.charAt(i)){
                count++;
                System.out.println(s.charAt(i-1) + " "+s.charAt(i)+" "+i);
                System.out.println(count);
                }
            
            }
        }
        if(s.charAt(l-2) != s.charAt(l-1)){finalres++;}
        return finalres;
    }
}



