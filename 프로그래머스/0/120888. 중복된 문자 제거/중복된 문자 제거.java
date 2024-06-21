import java.util.*;
class Solution {
    public String solution(String input) {
        // LinkedHashSet을 사용하여 중복을 제거하고 입력 순서를 유지합니다.
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }

        // StringBuilder를 사용하여 결과 문자열을 만듭니다.
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }

        return result.toString();
    }
}