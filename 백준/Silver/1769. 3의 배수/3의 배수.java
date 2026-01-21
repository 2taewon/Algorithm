import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = 0;
        while (s.length() > 1){
            char[] c = s.toCharArray();
            int sum = 0;

            for (int i = 0; i < c.length; i++){
                sum += c[i] - '0';
            }
            s = String.valueOf(sum);
            result++;
        }

        System.out.println(result);
        int temp = Integer.parseInt(s);
        if(temp % 3 == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}