import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> st = new Stack<>();
        int sum = 0;
        int n = Integer.parseInt(br.readLine());

        int first = Integer.parseInt(br.readLine());
        st.push(first);

        for(int i = 1; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k != 0){
                st.push(k);
            }
            else{
                st.pop();
            }
        }
        
        int result = st.size();
        for(int i = 0; i < result; i++) {
            sum += st.pop();
        }

        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}