import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue <Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int cnt = 0;
                
        for(int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        
        while(!queue.isEmpty()) {
            for(int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll(); //해당 프로세스 실행
                    cnt++; //실행횟수 추가
                    if (i == location) return cnt;
                }
            }
        }
        
        return 0;
    }
}