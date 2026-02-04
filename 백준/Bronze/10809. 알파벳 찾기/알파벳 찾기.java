import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] idx = new int[26];

        String s = br.readLine();

        for(int i = 0; i < 26; i++) {
            idx[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            if (idx[s.charAt(i) - 'a'] != -1) {
                continue;
            }
            idx[s.charAt(i) - 'a'] = i;
        }

        for(int i = 0; i < 26; i++) {
            System.out.print(idx[i] + " ");
        }
    }
}