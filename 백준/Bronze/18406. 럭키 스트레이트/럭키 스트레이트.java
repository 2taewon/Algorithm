import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int left = 0;
        int right = 0;
        char[] ch = br.readLine().toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(i < ch.length / 2){
                left += ch[i] - '0';
                continue;
            }
            right += ch[i] - '0';
        }

        if(left == right){
            bw.write("LUCKY");
        }
        else {
            bw.write("READY");
        }
        bw.flush();
        bw.close();
    }
}