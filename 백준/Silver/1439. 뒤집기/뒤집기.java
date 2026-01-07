import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        int s_cnt = 0;
        char temp = ' ';

        for(int i = 0; i < ch.length-1; i++){
           temp = ch[i];
           if(temp != ch[i+1]){
               s_cnt++;
           }
        }
        if (s_cnt % 2 == 1){
            s_cnt++;
        }
        System.out.println(s_cnt / 2);
    }
}