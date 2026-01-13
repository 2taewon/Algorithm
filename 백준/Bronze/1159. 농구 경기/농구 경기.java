import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            char ch = sc.next().charAt(0);
            arr[ch - 'a']++;
        }

        /*
        * 뒤에 orElse(0) 추가한 이유는 배열에 값이 없으면 최대값을 모르기때문에 어떤 값을 리턴해줘야할지 몰라서
        * 기본값 0을 리턴하도록 설정해준 것이다.
        */
        if(Arrays.stream(arr).max().orElse(0) < 5){ 
            System.out.print("PREDAJA");
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 5){
                System.out.print((char)(i + 'a'));
            }
        }
        
    }
} 