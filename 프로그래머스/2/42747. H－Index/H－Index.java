import java.util.*;

class Solution {
    public int solution(int[] citations) {

        for (int i = citations.length; i >= 1; i--) {
            int h = i;
            int count = (int) Arrays.stream(citations)
                               .filter(c -> c >= h)
                               .count();

            if(count >= h) {
               return h;
            }
        }
        return 0;
    }
}