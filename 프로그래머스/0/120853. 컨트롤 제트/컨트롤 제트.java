import java.util.*;
class Solution {
    public int solution(String s) {
        String[] parts = s.split(" ");
        
        Stack<Integer> stack = new Stack<>(); 
        
        for(String part : parts){
            
            if(part.equals("Z")){
                
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
            
            int number = Integer.parseInt(part); 
            stack.push(number);
            }
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        return sum;
    }
}