class Solution {
    public long maxAlternatingSum(int[] arr) {

        int n = arr.length;

        int[] res = new int[n];

        arr = Arrays.stream(arr)
                    .boxed()
                    .sorted((a, b) -> Integer.compare(Math.abs(b), Math.abs(a)))
                    .mapToInt(Integer::intValue)
                    .toArray();

        for(int i = 0 , j = 0 ; i < n && j < n ; i++ , j+=2){
            res[j] = arr[i];
        }
        for(int k = (n%2 == 0)? n-1 : n-2 , l = n-1 ; k > 0 ; k-=2 , l--){
            res[k] = arr[l];
        }

        long ans = res[0]*res[0];
        for(int i = 1 ; i < n ; i++){
        ans = (i%2 == 0) ? ans + (res[i]*res[i]) : ans - (res[i]*res[i]) ;
        
        }

        return ans;
    }
}
