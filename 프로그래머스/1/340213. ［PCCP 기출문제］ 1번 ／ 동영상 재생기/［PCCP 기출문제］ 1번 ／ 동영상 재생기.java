import java.time.*;
import java.time.format.DateTimeFormatter;


class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime open_start = LocalTime.parse("00:" + op_start, formatter);
        LocalTime open_end = LocalTime.parse("00:" + op_end, formatter);
        LocalTime video_length = LocalTime.parse("00:" + video_len, formatter);
        LocalTime position = LocalTime.parse("00:" + pos, formatter);

        
                 if (!position.isBefore(open_start) && !position.isAfter(open_end)){
             position = open_end;
         }
        // 각 명령어를 순차적으로 처리
        for (String command : commands) {
            if (command.equals("next")) {
                position = position.plusSeconds(10);
                // 동영상의 길이를 초과하지 않도록 조정
                if (position.isAfter(video_length)) {
                    position = video_length;
                }
            } else if (command.equals("prev")) {
                // 현재 위치가 10초 미만일 경우 00:00:00으로 이동
                if (position.toSecondOfDay() < 10) {
                    position = LocalTime.MIN; // 00:00:00
                } else {
                    position = position.minusSeconds(10);
                }
            }

            // 명령어 실행 후 현재 위치가 오프닝 구간에 있는지 확인하고 건너뛰기
            if (!position.isBefore(open_start) && !position.isAfter(open_end)) {
                position = open_end;
            }
            
            
        }
                 if (!position.isBefore(open_start) && !position.isAfter(open_end)){
             position = open_end;
         }
        String answer = String.format("%02d:%02d", position.getMinute(), position.getSecond());
        return answer;
    }
}