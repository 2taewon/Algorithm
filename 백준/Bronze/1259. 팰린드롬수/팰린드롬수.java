import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		while(true) {
			String str = sc.next();
			if(str.equals("0")) {
				break;
			}
			if(str.length() == 1) {
				list.add("yes");
				continue;
			}
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(str.length() -(i+1))) {
				if(str.length() - (i+1) < i) {
					list.add("yes");
					break;
				}
			}
			else if(str.charAt(i) != str.charAt(str.length() -(i+1))) {
				list.add("no");
				break;
				}
			}
		}
		for(String s : list)
			System.out.println(s);
	}
}
