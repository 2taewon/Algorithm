import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list_cnt = new ArrayList();
        Stack<Integer> st = new Stack();
        
        //정수로 나누게 되면 실수가 버려지게 되기때문에 하루가 날라가는 일이 생김. 
        for(int i = progresses.length - 1; i >= 0; i--){
            int day = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
            st.push(day);
        }
        
        while(!st.isEmpty()){
            //맨 처음 미리 빼고 cnt = 1로 지정
            int check = st.pop();
            int cnt = 1;
            
            //처음 날짜가 배포 될 때, 그 다음 날짜가 처음 날짜보다 작으면 같이 베포 후 cnt 증가 
            while(!st.isEmpty() && st.peek() <= check){
                st.pop();
                cnt++;
            }
            list_cnt.add(cnt);
        }
        
        int[] answer = new int[list_cnt.size()];
        for(int j = 0; j<answer.length; j++){
            answer[j] = list_cnt.get(j); 
        }
        return answer;
    }
}