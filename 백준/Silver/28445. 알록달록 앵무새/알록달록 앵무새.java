import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String[] dad = sc.nextLine().split(" ");
       String[] mom = sc.nextLine().split(" ");

       String[] arr = new String[4];
       arr[0] = dad[0];
       arr[1] = dad[1];
       arr[2] = mom[0];
       arr[3] = mom[1];

       Set<String> set = new HashSet<>();
       for(String s : arr) {
           set.add(s);
       }
       arr = set.toArray(new String[set.size()]);
       Arrays.sort(arr);

       for(int i = 0; i < arr.length; i++) {
           for(int j = 0; j < arr.length; j++) {
               System.out.println(arr[i] + " " + arr[j]);
           }
       }
    }
}