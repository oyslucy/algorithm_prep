import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int width = clothes.length;
        HashMap<String, Integer> type_map = new HashMap<>();
        for(int i = 0; i < width; i++) {
            type_map.put(clothes[i][1], type_map.getOrDefault(clothes[i][1], 0) + 1);
        }
        for(String type: type_map.keySet()) {
            answer *= (type_map.get(type) + 1);
        }
        return answer-1;
    }
}