class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();

        Map<String , String> map = new HashMap<>();

        for(List<String> a : knowledge){
            map.put(a.get(0) , a.get(1));
     }

        StringBuilder str = new StringBuilder();

        int i = 0;
        while(i < n){
            if(s.charAt(i) == '('){
                int j = s.indexOf(")" , i+1);
                String temp = s.substring(i+1 , j);
                str.append(map.getOrDefault(temp , "?"));
                i = j;
            }
            else {
                str.append(s.charAt(i));
            }
            i++;
        }


            //always use .toString to convert string Builder to string type 
            return str.toString();

    }


}
