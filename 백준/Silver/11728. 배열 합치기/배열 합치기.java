import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int[] arr = new int[N1+N2];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N1 ; i++){
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = N1; i < N1+N2 ; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}