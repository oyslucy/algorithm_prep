import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> sum_map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            sum_map.put(genres[i], sum_map.getOrDefault(genres[i], 0) + plays[i]);
        }
        List<String> keySet = new ArrayList<>(sum_map.keySet());
        keySet.sort((o1, o2) -> sum_map.get(o2).compareTo(sum_map.get(o1)));

        for(String genre: keySet){
            int [] best_song = {-1, -1};
            for(int i = 0; i < genres.length; i++){
                if(genre.equals(genres[i])){
                    if(best_song[0] == -1){
                        best_song[0] = i;
                    } else { // 첫 번째 best song 존재
                        if(plays[i] > plays[best_song[0]]) {
                            best_song[1] = best_song[0];
                            best_song[0] = i;
                        } else {
                            if(best_song[1] == -1 || plays[i] > plays[best_song[1]]) {
                                best_song[1] = i;
                            }
                        }
                    }
                }
            }
            ans.add(best_song[0]);
            if(best_song[1] != -1){
                ans.add(best_song[1]);
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}