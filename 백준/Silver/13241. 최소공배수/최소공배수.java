import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long A = sc.nextLong();
		Long B = sc.nextLong();
		System.out.println(LCM(A,B));
	}
	
	static Long LCM(Long A, Long B) {
		return A * B / GCD(A, B);
	}
	
	static Long GCD(Long A, Long B) {
		Long div = A % B;
		if(div == 0) {
			return B;
		}
		
		return GCD(B, div);
	}
}
