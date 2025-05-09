import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[][] arr = new int[a][2];
		for(int i = 0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			 arr[i][0] = Integer.parseInt(st.nextToken());
			 arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,(o1, o2)->{
			if(o1[0] == o2[0]) { return o1[1] - o2[1]; }  
			return o1[0] - o2[0];
		});
		
		for(int j = 0; j<arr.length; j++) {	
		System.out.println(arr[j][0] +" "+ arr[j][1]);
		}
	}
}
