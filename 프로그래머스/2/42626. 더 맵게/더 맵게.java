import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : scoville){
            pq.offer(num);
        }
        
        int count = 0;

        while(pq.peek() < K){
            if(pq.size() < 2){
                return - 1;
            }
            
            int first = pq.poll();
            int second = pq.poll();
            
            int mixed = first + (second * 2);
            
            pq.offer(mixed);
            count++;
        }
        return count;
        
    }
}