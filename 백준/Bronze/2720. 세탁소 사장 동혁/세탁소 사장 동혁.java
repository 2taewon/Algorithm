import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money_cnt = sc.nextInt();
		for(int i = 0; i<money_cnt; i++) {
			int money = sc.nextInt();
			int temp = 0;
			System.out.print(money/25 + " ");
			temp = money % 25;
			System.out.print(temp/10 + " ");
			temp = temp % 10;
			System.out.print(temp/5 + " ");
			temp = temp % 5;
			System.out.println(temp/1);
		}
	}
}
