import java.util.TreeSet;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        TreeSet ts = new TreeSet();
		for(int i = 0; i<str.length; i++) {
			ts.add(Integer.parseInt(str[i]));
		}
        String answer = ts.first() + " " + ts.last();
        return answer;
    }
}