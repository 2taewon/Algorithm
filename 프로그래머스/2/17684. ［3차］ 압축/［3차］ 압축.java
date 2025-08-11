import java.util.*;

class Solution {
    public int[] solution(String msg) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> dictionary = new ArrayList<>();
        dictionary.add("0");
        for(char c : alphabet.toCharArray()){
            dictionary.add(String.valueOf(c));
        }
        
        List<Integer> answer = new ArrayList<>();
        
        int i = 0;
        while(i < msg.length()){
            for(int j = msg.length(); j>=i; j--){
                String s = msg.substring(i, j);
                if(dictionary.contains(s)){
                    answer.add(dictionary.indexOf(s));
                    if(j+1<msg.length()){
                        String next = s + msg.substring(j, j+1);
                        dictionary.add(next);
                    }
                    i += s.length();
                    break;
                }
            }
        }
        
        return answer.stream().mapToInt(x->x.intValue()).toArray();
    }
}