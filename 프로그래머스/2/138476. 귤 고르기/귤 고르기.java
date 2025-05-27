import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] cnt = new int[tangerine[tangerine.length-1]];
        for(int i = 0; i<tangerine.length; i++){
            cnt[tangerine[i]-1]++;
        }
        Arrays.sort(cnt);
        
        int index = cnt.length - 1;
        while(true){
            k = k - cnt[index];
            index--;
            answer++;
            if(k <= 0){
                break;
            }
        }
        
        return answer;
    }
}