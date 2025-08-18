import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0; // 총 시간
        int queue_weight = 0; // 다리 위 트럭의 무게
        Queue <Integer> queue = new LinkedList<>();
        
        for(int truck_weight: truck_weights) {
            while (true) {
                if(queue.size() == bridge_length) { // 꽉 찼을 때
                    queue_weight -= queue.poll(); // 선두 트럭 제거
                }
                
                if(queue_weight + truck_weight <= weight) { 
                    queue.add(truck_weight);
                    queue_weight += truck_weight;
                    answer++;
                    break;
                } else { 
                    queue.add(0);
                    answer++;
                }
            }
        }
        return answer + bridge_length;
    }
}