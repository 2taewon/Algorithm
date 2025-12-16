import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        if(arr.length == 4 || arr.length == 6){
        for(int i = 0; i<arr.length; i++){
            if((arr[i] - 48) >= 0 && arr[i] - 48 <= 9){
                continue;
            }
            else {
                answer = false;
                return answer;
                }
            }
        }
        else {
            answer = false;
            return answer;
        }
        return answer;
    }
}

// else if((s.charAt(i) - 48) != s.charAt(i)) {
            //     answer = false;
            //     return answer;
            // }


// if((s.charAt(i) - 48) == s.charAt(i)){
            //     System.out.println("1");
            // }
            // else{
            //     System.out.println("0");
            // }