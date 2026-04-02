import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        // 힙 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // 스코빌 힙에 넣기
        for (int num : scoville){
            pq.offer(num);
        }
        
        int count = 0;
        
        // K 이상이 될 때까지 
        while(pq.peek() < K){
            // 2개 미만이면 불가능
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