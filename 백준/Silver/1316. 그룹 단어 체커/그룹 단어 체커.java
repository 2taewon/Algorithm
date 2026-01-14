import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();

            if (chars.length == 1) {
                result += 1;
                continue;
            }

            int[] arr = new int[26];
            arr[chars[0] - 'a'] = 1;

            for (int j = 1; j < chars.length; j++) {
                if (chars[j - 1] != chars[j] && arr[chars[j] - 'a'] != 0) {
                    break;
                }
                else if (j == chars.length - 1) {
                    result += 1;
                }
                arr[chars[j] - 'a'] += 1;
            }
        }
        System.out.println(result);
    }
}