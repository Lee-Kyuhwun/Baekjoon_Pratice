class Solution {
    public int solution(int[] sides) {
        int max = sides[0];
         int answer = 0;
        int sum =0;
        for(int i=0 ;i<3; i++){
            sum += sides[i];
            if(max < sides[i])
                max = sides[i];
        }
        if(sum - 2 *max >0)
            answer = 1;
        else
            answer = 2;
       
        return answer;
    }
}