import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int n = sc.nextInt();
         for(int i = 0; i <n; i++){
            Stack<Character> st = new Stack<>();
            String str = sc.next();

            for(int j = 0; j < str.length(); j++){
                if(!st.isEmpty() && str.charAt(j) == st.peek()){
                    st.pop();
                    continue;
                }
                st.push(str.charAt(j));
            }
            if(st.isEmpty()){
                result++;
            }
         }
        System.out.println(result);
    }
} 