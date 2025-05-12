import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> q = new ArrayDeque();
        
        for(int i = 0; i< s.length(); i++){
            q.addLast(s.charAt(i));
            if(q.peekFirst() == ')') {
                return false;
            }
            if(q.peekLast() == ')'){
                q.pollFirst();
                q.pollLast();
            }
        }        
        
        return q.isEmpty() ? true : false;
    }
}