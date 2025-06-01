import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue <Integer> heap = new PriorityQueue<>();
        int num = 0;
        int ans = -1;
        
        for(int s : scoville) heap.add(s);
        
        while(heap.size() >= 2) {
            int first_scov = heap.poll();
            int second_scov = heap.poll();
            int mixed_scov = first_scov + second_scov * 2;
            if(first_scov >= K) {
                return num;
            } else num++;
            

            if(mixed_scov >= K) {
               if(heap.isEmpty()) return num;
                else {
                    if(heap.peek() >= K) return num;
                    else heap.add(mixed_scov);
                }
            } else {
                heap.add(mixed_scov);
            }
        }
        return ans;
    }
}