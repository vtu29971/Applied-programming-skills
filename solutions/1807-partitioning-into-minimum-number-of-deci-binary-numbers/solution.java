class Solution {
    public int minPartitions(String n) {

        int max = 0;

        for(Character c : n.toCharArray()){
            int s = c - '0';
            max = Math.max(max , s);
        }
        return max;
    }
}
