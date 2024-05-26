import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        // ArrayList를 사용하여 조건에 맞는 문자열을 저장
        ArrayList<String> list = new ArrayList<>();
        
        for (String a : strArr) {
            // "ad"를 포함하지 않는 문자열만 추가
            
            
            
            
            if (!a.contains("ad")) {
                list.add(a);
            }
        }

        // ArrayList를 배열로 변환하여 반환
        
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}
