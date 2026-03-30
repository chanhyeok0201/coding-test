import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
  
        Map<String, Integer> map = new HashMap<>();
        for(String pp : participant){
            map.put(pp, map.getOrDefault(pp,0)+1);
        }       
        for (String cp : completion){
            map.put(cp, map.get(cp)-1);
        }       
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                answer = key;
                break;
            }
        }       
        return answer;
    }
}