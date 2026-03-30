import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int mon : nums){
            set.add(mon);
        }
        
        return Math.min(set.size(), nums.length/2);
    }
}