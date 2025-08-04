import java.util.*;

class Solution {
    public int solution(String dirs) {
        // x,y좌표, cnt 처음지난길 개수
        int x=0,y=0,cnt=0;
        // 지난길 체크
        Set<String> set = new HashSet<>();
        // 명령어 반복
        for(char c : dirs.toCharArray()){
            // nx,ny 다음좌표
            int nx = x;
            int ny = y;
            // 명렁어 반대로 길을 지난경우
            String opposite = "";
            // 명령어 분기처리
            if(c=='U'){
                opposite="D"; //반대는 D
                ny++;         //다음좌표 증가
            }else if(c=='D'){
                opposite="U";
                ny--;
            }else if(c=='R'){
                opposite="L";
                nx++;
            }else if(c=='L'){
                opposite="R";
                nx--;
            }
            // 경계값을 넘으면 PASS
            if(ny<-5 || ny>5 || nx<-5 || nx>5) continue;
            // 반대로 길을 지난경우
            String before = opposite+x+y;
            // 똑바로 길을 지난경우
            String after = String.valueOf(c)+nx+ny;
            // x,y좌표 갱신
            x=nx;
            y=ny;
            // 똑바로, 반대로 길을 지난경우면 PASS
            if(set.contains(before) || set.contains(after)) continue;
            // 똑바로, 반대로 모두 set에 넣는다.
            set.add(before);
            set.add(after);
            // 처음지난길 개수 +1 증가
            cnt++;
            
        }
        // 정답 리턴
        return cnt;
    }
}