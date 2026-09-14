class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean flag = true;
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;

        for(char c : s.toCharArray()){


            while(list.contains(c)){
                flag = false;
                list.remove(0);
            }
            list.add(c);

            max = Math.max(list.size() , max);
        }
    if(flag) max=list.size();
    return max;
    }
}
