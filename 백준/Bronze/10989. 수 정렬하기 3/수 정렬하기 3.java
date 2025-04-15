import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
		int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
		
		Arrays.sort(arr);
		for(int j = 0; j<arr.length; j++) {
			bw.write(arr[j] + "\n");
		}
		bw.flush();
		bw.close();
	}
}
/* bw.write(arr[j])으로 쓰면 안되는 이유 :
 * @이건 정수값 arr[j]를 문자로 변환해서 출력한다 
 * 즉, arr[j]가 5라면 'char(5)'가 출력 
 * 그런데 char(5)는 사람이 읽을 수 있는 문자가 아니라 제어문자(control character)
 * 그래서 출력 결과가 물음표(???)처럼 이상하게 보이거나 아예 안 나올 수 있음.
 * */
