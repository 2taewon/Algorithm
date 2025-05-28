class Solution {
    public long solution(int n) {
        long answer = 0;
        long[] dy = new long[n+1];
        dy[0] = 1;
        dy[1] = 1;
        for(int i = 2; i<=n; i++){ // 배열 - 1 할 필요 없이 인덱스가 곧 n 이다.
            dy[i] = (dy[i-1] + dy[i-2])%1234567;
        }
        
        return dy[n];
    }
}