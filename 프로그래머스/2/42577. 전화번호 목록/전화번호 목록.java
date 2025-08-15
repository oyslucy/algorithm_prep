import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {  
        Arrays.sort(phone_book); // 짧은 전화번호부터
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true; 
    }
}   
        
        
       


        
//         HashSet<String> map = new HashSet<>(Arrays.asList(phone_book));

//         for(String p : phone_book){
//             for(int i = 1; i < p.length(); i++){
//                 String prefix = p.substring(0, i);
//                 if(map.contains(prefix)){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }