import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int index = 0;
        String[] arr = new String[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
            if(Character.isDigit(arr[i].charAt(0))){
                num = Integer.parseInt(arr[i]);
                index = i;
            }
        }

        switch(index){
            case 0:
                num += 3;
                break;
            case 1:
                num += 2;
                break;
            case 2:
                num += 1;
                break;
        }

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if(num % 3 == 0 && num % 5 != 0){
            System.out.println("Fizz");
        }
        else if(num % 5 == 0 && num % 3 != 0){
            System.out.println("Buzz");
        }
        else if(num % 3 != 0 && num % 5 != 0){
            System.out.println(num);
        }
    }
}