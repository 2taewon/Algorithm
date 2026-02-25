import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] freq = new int[8001]; // -4000 ~ 4000 -> +4000 shift

        int sum = 0;
        int maxFreq = 0;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
            sum += x;

            int idx = x + 4000;
            freq[idx]++;
            if (freq[idx] > maxFreq) maxFreq = freq[idx];
        }

        Arrays.sort(arr);

        // 1) 산술평균 (반올림)
        sb.append(Math.round((double) sum / n)).append('\n'); // double로 나눠야 함 [web:6]

        // 2) 중앙값
        sb.append(arr[n / 2]).append('\n');

        // 3) 최빈값: 여러 개면 두 번째로 작은 값
        int mode = 0;
        boolean firstFound = false;
        for (int i = 0; i < 8001; i++) {
            if (freq[i] == maxFreq) {
                if (!firstFound) {
                    mode = i - 4000;      // 첫 번째(가장 작은) 최빈값
                    firstFound = true;
                } else {
                    mode = i - 4000;      // 두 번째 최빈값(=두 번째로 작은 최빈값)
                    break;
                }
            }
        }
        sb.append(mode).append('\n'); // “여러 개면 두 번째로 작은 값” 규칙 [web:2]

        // 4) 범위
        sb.append(arr[n - 1] - arr[0]).append('\n');

        System.out.print(sb.toString());
    }
}