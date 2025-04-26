import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int L_cnt = 0;
		int S_cnt = 0;
		
		int N = sc.nextInt();
		
		char[] arr = sc.next().toCharArray();
		for(int i = 0; i<N; i++) {
			if(arr[i] == 'L') {
				L_cnt++; continue;
			}
			if(arr[i] == 'S') {
				S_cnt++; continue;
			}
			
			if(L_cnt >= 1 && S_cnt == 0 && arr[i] == 'K') {
				break;
			}
			
			if(S_cnt >= 1 && L_cnt == 0 && arr[i] == 'R') {
				break;
			}
            if(S_cnt == 0 && L_cnt == 0 && arr[i] == 'R') {
				break;
			}
			if(S_cnt == 0 && L_cnt == 0 && arr[i] == 'K') {
				break;
			}
			if(L_cnt == 1 && arr[i] == 'R') {
				L_cnt--;
			}
			if(S_cnt == 1 && arr[i] == 'K') {
				S_cnt--;
			}
			cnt++;
			}
		System.out.println(cnt);
		}
	}
