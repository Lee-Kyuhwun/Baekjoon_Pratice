import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // l부터 r까지 순회하면서 조건(자릿수가 0 또는 5인지) 만족 여부 확인
        for (int num = l; num <= r; num++) {
            if (isZeroFive(num)) {
                arrayList.add(num);
            }
        }

        // 아무것도 못 찾았다면 -1만 들어있는 배열
        if (arrayList.isEmpty()) {
            return new int[]{-1};
        }

        // ArrayList -> int[] 변환
        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }

    private boolean isZeroFive(int num) {
        String s = String.valueOf(num);
        for (char check : s.toCharArray()) {
            if (check != '0' && check != '5') {
                return false;
            }
        }
        return true;
    }
}
