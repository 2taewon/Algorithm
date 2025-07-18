import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : priorities) {
            queue.add(num);
        }
        
        while(!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 현재 우선순위가 가장 높은 우선순위와 같을 때
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}