class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0; int y_cnt = 0;
		String str = s.toLowerCase();
		char[] arr = str.toCharArray();
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == 'p') {
				p_cnt++;
			}
			else if(arr[i] == 'y') {
				y_cnt++;
			}
		}
        if(p_cnt != y_cnt) {
            answer = false;
        }
		return answer;
    }
}