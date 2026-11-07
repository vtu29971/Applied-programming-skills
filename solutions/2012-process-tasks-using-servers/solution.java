import java.util.*;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {

        int s = servers.length;
        int t = tasks.length;
        
        PriorityQueue<int[]> free = new PriorityQueue<>((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        PriorityQueue<long[]> busy = new PriorityQueue<>((a, b) -> {
        if (a[0] != b[0]) return Long.compare(a[0], b[0]);
        if (a[1] != b[1]) return Long.compare(a[1], b[1]);
        return Long.compare(a[2], b[2]);
    }
);

        for(int i = 0 ; i < s ; i++){
            free.offer(new int[]{servers[i],i});
        }

        int[] res = new int[t];

        for(int i = 0 ; i < t ; i++){
          
          while(!busy.isEmpty() && busy.peek()[0] <= i){
            long[] temp = busy.poll();
            free.offer(new int[]{(int) temp[1] , (int) temp[2]});
          }

          if(free.isEmpty()){
            long[] temp = busy.poll();
            res[i] = (int) temp[2];
            busy.offer(new long[]{temp[0]+tasks[i] , temp[1] , temp[2]});
          }

          else{
            int[] temp = free.poll();
            res[i] = temp[1];
            busy.offer(new long[]{(long) i + tasks[i] , temp[0] , temp[1]});
          }
        }

        return res;
    }
}
