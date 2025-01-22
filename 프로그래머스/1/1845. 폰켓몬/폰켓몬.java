import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max_num = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }
        return Integer.min(set.size(), max_num);
    }
}