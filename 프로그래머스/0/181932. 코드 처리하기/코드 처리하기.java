class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder(); // ret을 효율적으로 만들기 위해 StringBuilder 사용
        int mode = 0; // 초기 mode는 0
        
        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx); // code의 현재 문자
            
            if (currentChar == '1') {
                mode = 1 - mode; // mode를 0에서 1로 또는 1에서 0으로 변경
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(currentChar); // mode 0에서 짝수 인덱스인 경우 문자 추가
                } else if (mode == 1 && idx % 2 != 0) {
                    ret.append(currentChar); // mode 1에서 홀수 인덱스인 경우 문자 추가
                }
            }
        }
        
        // ret이 빈 문자열인 경우 "EMPTY" 반환
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret.toString();
        }
    }

}
