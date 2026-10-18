class Solution {
    public String convertDateToBinary(String date) {
        
        int yr = Integer.parseInt(date.substring(0,4));
        int m = Integer.parseInt(date.substring(5,7));
        int d = Integer.parseInt(date.substring(8,10));
        
        String sb = Integer.toBinaryString(yr)+"-"+Integer.toBinaryString(m)+"-"+Integer.toBinaryString(d);

        return sb;
    }
}
