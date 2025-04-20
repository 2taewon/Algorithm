import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			String str = sc.next();
			int x = sc.nextInt();
			hm.put(str, hm.getOrDefault(str, 0)+ x);
		}
		if(hm.containsValue(5)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
