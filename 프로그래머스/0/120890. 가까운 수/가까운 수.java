import java.lang.Math;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int a = Math.abs(array[0] - n);
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(array[i] - n);
            if(diff < a || (diff == a && array[i] < answer)){
                a = diff;
                answer = array[i];
            }
        }
        return answer;
    }
}
