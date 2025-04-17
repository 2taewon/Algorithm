import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int x = sc.nextInt();
		int y = 0;
		int N = 0;
		for(int i = 0; i<x; i++) {
			al.add(y = sc.nextInt());
		}
		Collections.sort(al);
		int first = al.get(0);
		int last = al.get(al.size()-1);
		if(x == 1) {
			N = y*y;
		}
		else {
			N = first * last;
		}
		System.out.println(N);
	}
}
