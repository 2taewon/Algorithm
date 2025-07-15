import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        LinkedList<String> LRU = new LinkedList<>();
        
        int time = 0;
        for(String c : cities){
            String upper = c.toUpperCase();
            
            if(!LRU.isEmpty()){
                if(LRU.contains(upper)){
                    time += 1;
                    if(LRU.size()==cacheSize){
                        LRU.remove(upper);
                    }
                }
                else{
                    time += 5;
                    if(LRU.size() == cacheSize){
                        LRU.poll();
                    }
                }
            }
            else{
                time += 5;
            }
            if(cacheSize > 0){
                LRU.offer(upper);
            }
        }
        return time;
    }
}