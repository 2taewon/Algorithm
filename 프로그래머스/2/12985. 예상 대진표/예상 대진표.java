class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        for(int i = 0; i<n/2; i++){
            if(a == b ){
                break;
            }
            if(a % 2 == 0){
                a /= 2;
            }
            else {
                a = (a+1) / 2;
            }
            if(b % 2 == 0){
                b /= 2;
            }
            else {
                b = (b+1) / 2;
            }
            answer++;
        }
        

        return answer;
    }
}