class Solution {
    public int solution(int[] arr) {
        if(arr.length == 1){
            return arr[0];
        }
        int answer = LCM(arr[0], arr[1]);
        if(arr.length == 2){
            return answer;
        }
        for(int i = 2; i<arr.length; i++){
           answer = LCM(answer, arr[i]);
        }
        
        return answer;
    }
    
    // 최소공배수 구하는 법 
    static int LCM(int a, int b){
        int num = a * b / GCD(a, b); // 두 수를 곱한 후, 최대공약수로 나누면 그 값이 최소공배수 
        return num;
    }
    
    // 최대공약수 구하는 법 
    static int GCD(int a, int b){ // 재귀함수를 통해 최대 공약수 구현 
        int div = a % b;
            if(div == 0){
                return b;
            }
        return GCD(b, div); 
    }
}