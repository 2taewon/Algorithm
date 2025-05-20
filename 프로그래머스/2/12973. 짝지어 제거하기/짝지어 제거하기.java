import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        int answer = -1;
        for(int i = 0; i <s.length(); i++){
            if(st.isEmpty()){
	        		st.push(s.charAt(i));
	        	}
	        else {
	            if(i > 0 && (st.peek() == s.charAt(i))){
	                st.pop();
	            	}
	            else {
	            	st.push(s.charAt(i));
	            	}
	        	 }
         }
        
        if(st.isEmpty()){
            answer = 1;
        }
        else if(!st.isEmpty()){
            answer = 0;
        }
        return answer;
    }
}