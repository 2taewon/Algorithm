import java.util.*;

public class Main {
    static int[] dwarfs = new int[9];     
    static int[] selected = new int[7];   
    static boolean found = false;         

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = sc.nextInt();
        }

        combination(0, 0);
    }

   
    public static void combination(int idx, int count) {
        if (found) return;

        if (count == 7) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                sum += selected[i];
            }

            if (sum == 100) {
                Arrays.sort(selected); 
                for (int i = 0; i < 7; i++) {
                    System.out.println(selected[i]);
                }
                found = true;
            }
            return;
        }

        if (idx == 9) return; 

        
        selected[count] = dwarfs[idx];
        combination(idx + 1, count + 1);

        
        combination(idx + 1, count);
    }
}