import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        for(int i = 0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }
        while(pq.peek() < K){
            if(pq.size() < 2) return -1;
            int first = pq.poll();
            int second = pq.poll();
            int mix = first + (second * 2);
            pq.offer(mix);
            answer++;
        }
        
        return answer;
    }
}