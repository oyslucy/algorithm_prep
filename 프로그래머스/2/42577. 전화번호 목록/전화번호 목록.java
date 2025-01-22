import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> map = new HashSet<>(Arrays.asList(phone_book));

        for(String p : phone_book){
            for(int i = 1; i < p.length(); i++){
                String prefix = p.substring(0, i);
                if(map.contains(prefix)){
                    return false;
                }
            }
        }
        return true;
    }
}