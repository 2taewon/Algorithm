import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String N = sc.next();
		int B = sc.nextInt();
		
		int mul = 1;
		int sum = 0;
		
		for(int i = N.length()-1; i>=0; i--) {
			char ch = N.charAt(i);
			int num;
			
			if(Character.isDigit(ch)) {
				num = ch - '0';
			}
			else {
				num = ch - 'A' + 10;
			}
			sum += num * mul; // B 진수 구하는 공식
			mul *= B;
		}
		System.out.println(sum);
	}
}
