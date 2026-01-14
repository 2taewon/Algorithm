import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            HashMap<String, Integer> map = new HashMap<>();
            int cnt = 1;
            int m = sc.nextInt();
            for(int j = 0; j < m; j++){
                String key = sc.next();
                String value = sc.next();
                map.put(value, map.getOrDefault(value, 0) + 1);
            }
            for(int val : map.values()){
                cnt *= (val + 1);
            }
            System.out.println(cnt - 1);
        }
        
    }
} 
