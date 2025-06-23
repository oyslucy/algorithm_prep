import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String [] arr = Arrays.stream(numbers)
                             .mapToObj(String::valueOf)
                             .toArray(String[]::new);
        String answer = "";
        
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        
        if (arr[0].equals("0")) return "0"; // 전부 0일 경우 "0" 만 반환
        
        for(int i = 0; i < arr.length; i++) {
            answer = answer.concat(arr[i]); // 정렬된 문자열 전부 출력
        }

        return answer;
    }
}