import java.util.*; 
class Solution {
    public int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();
        int a =0;
        for(int i =2; i<=n; i++){
            while(n % i == 0){
                if(!factors.contains(i)){
                                    factors.add(i);

                }
                n /= i;
            }
        }
                int[] answer = new int[factors.size()];
        for(int i =0; i<factors.size(); i++){
            answer[i] = factors.get(i);
        }
        
        return answer;
    }
}