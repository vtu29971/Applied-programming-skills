class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        int w = words.length;

        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < w ; i++){
            int len = words[i].length();
            for(int j = 0 ; j < len ; j++){
                if(x == words[i].charAt(j)){
                    list.add(i);
                    break;

                }
            }
        }
        return list;
    }
}
