import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numberList = new ArrayList<>();
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                numberList.add(Character.getNumericValue(c));
            }
        }
        numberList.sort(Comparator.naturalOrder());
        int[] answer = new int[numberList.size()];
        for(int i =0; i<numberList.size(); i++){
            answer[i]  = numberList.get(i);
        }
        
        
        return answer;
    }
}