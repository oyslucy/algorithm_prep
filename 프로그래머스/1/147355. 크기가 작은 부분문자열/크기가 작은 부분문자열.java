import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int total = t.length() - p.length() + 1;
        
        for (int i = 0; i < total; i++) {
            String sub = t.substring(i, i + p.length());
            
            if (sub.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}