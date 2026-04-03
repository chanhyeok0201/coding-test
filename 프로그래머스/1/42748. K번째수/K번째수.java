import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int idx = 0; idx < commands.length; idx++) {
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int[] nums = Arrays.copyOfRange(array, i-1, j);
            
            Arrays.sort(nums);
            
            answer[idx] = nums[k - 1];
        }
        
        return answer;
    }
}