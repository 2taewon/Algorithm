import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		char[][] arr = new char[5][15]; 

		for(int i = 0; i<arr.length; i++) {
			str = sc.next();
			for(int j = 0; j<str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i<15; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[j][i] == '\u0000') { // null character => \u0000
					continue;
				}
				System.out.print(arr[j][i]);
			}
		}
	}
}
