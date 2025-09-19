import java.util.*;
import java.lang.*;
import java.io.*;

// 불기 연도를 서기 연도로 바꾸려면 +543을 해야한다.
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a - 543);
    }
}