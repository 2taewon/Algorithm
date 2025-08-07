class Solution {
    public int solution(int n, int k) {
        String tr = Integer.toString(n,k);
        String[] arr = tr.split("0");
        int cnt = 0; 
        for(String s : arr){
            if("".equals(s)) continue; 
            if(isPrime(Double.parseDouble(s))) cnt++;
        } 
        return cnt;
    }
    
    public boolean isPrime(double n){ 
        if(n<=1) return false;
        else if(n<=3) return true;
        for(double i=2; i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}