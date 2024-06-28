class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order >0){
            int a = order % 10;
            if(a == 3 || a == 6 || a == 9){
             answer +=1;   
            }
            order = order / 10; 
        }
        return answer;
    }
}