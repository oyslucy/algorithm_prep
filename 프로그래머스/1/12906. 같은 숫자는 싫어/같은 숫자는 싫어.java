import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            int last_num = stack.peek();
            if(last_num != arr[i]) {
                stack.push(arr[i]);
            }
        }
        return stack.stream().mapToInt(i->i).toArray();
    }
}