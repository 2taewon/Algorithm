import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Stack st = new Stack();
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i<N; i++) {
				String str = br.readLine();
				String[] arr = str.split(" ");
				if(str.length() >= 6){
					st.push(Integer.parseInt(arr[1]));
				}
			
				
				switch(arr[0]) {
				case "pop" :
					if(st.isEmpty()) {
					System.out.println(-1); break;
					}
					System.out.println(st.pop());; break;
				case "size" :
					System.out.println(st.size());break;
				case "empty" :
					if(st.isEmpty()) {
						System.out.println(1);break;
					}
					else if(!st.isEmpty()) {
						System.out.println(0);break;
					}
				case "top" : 
					if(st.isEmpty()) {
						System.out.println(-1);break;
					}
					else {
					System.out.println(st.peek());break;
						}
					}
				}
			}
		}