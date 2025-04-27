import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		HashMap<Integer, String> map2 = new HashMap<Integer,String>();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			String name = sc.next();
			map.put(name, i+1);
			map2.put(i+1, name);
		}
		for(int j = 0; j<M; j++) {
			String str = sc.next();
			if(map.containsKey(str)) {
				System.out.println(map.get(str)); 
			}
			else {
				System.out.println(map2.get(Integer.parseInt(str)));
			}	
		}
	}
}
