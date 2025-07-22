import java.util.*;

class Solution {
    public int solution(int[] topping) {
        
        Map<Integer,Integer> cake1 = new HashMap<>();
        Map<Integer,Integer> cake2 = new HashMap<>();
       
        int answer = 0;
        for(int i=0;i<topping.length;i++){
            int element=topping[i];
            cake2.put(element, cake2.getOrDefault(element,0)+1);
        }

        for(int i=0;i<topping.length;i++){
            int element=topping[i];
            cake1.put(element, cake1.getOrDefault(element,0)+1);
            
            if(cake2.containsKey(element)){
                if(cake2.get(element)==1){
                    cake2.remove(element);
                }else{
                    cake2.put(element, cake2.getOrDefault(element,0)-1);
                }
            }
            if(cake1.keySet().size()==cake2.keySet().size()){
                answer++;
            }
        }
        return answer;
    }
}