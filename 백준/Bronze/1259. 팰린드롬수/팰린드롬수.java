import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        // Pseudo 코드 작성하기
        // 1. bufferedreader로 문자열 입력받기, parseInt로 정수 변경
        // 2. if (reverse한 값 == a) yes 출력 else no 출력
        // 3. 마지막 줄에는 0이 주어진다


        // 고민
        // 1. 정수를 reverse 시키는 함수가 있는가
        // 2. StringBuilder 사용 후 문자열->정수로 변경하는 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            // reverse
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s);
            String reversedStr = sb.reverse().toString();

//            // String -> int로 변환
//            int a = Integer.parseInt(sb.toString());
//            int reversedA = Integer.parseInt(reversedStr);

            if (s.equals("0")) break;

            // a와 reversedA가 동일하면 팰린드롬수
            if (s.equals(reversedStr)) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }

        }
    }
}