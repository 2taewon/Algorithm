import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        ArrayList<Character> list = new ArrayList();
        int z_cnt = 0;
        int cnt = 0;
        while (!(s.length() == 1)){
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '0'){
                z_cnt++; continue;
                }
            list.add(s.charAt(i));
            }
            s = Integer.toBinaryString(list.size());
            list.removeAll(list);
            cnt++;
        }
        
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = z_cnt;
        return answer;
    }
}