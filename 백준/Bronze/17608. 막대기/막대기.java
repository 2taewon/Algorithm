import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        int result = 0;

        for(int i = 0; i < n; i++) {
            st.push(Integer.parseInt(br.readLine()));
        }
        for(int j = 0; j < n; j++) {
            if(j == 0){
                max = st.pop();
                result++;
            }
            else if(st.peek() > max){
                max = st.pop();
                result++;
            }
            else if(st.peek() <= max){
                st.pop();
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}