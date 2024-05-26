import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        //ArrayList 선언
        ArrayList<Integer> tempList = new ArrayList<>();
        
        HashSet<Integer> deleteSet = new HashSet<>();
        
        for(int b: delete_list){
            deleteSet.add(b);
        }
        
        for(int a:arr){
            if(!deleteSet.contains(a)){
                tempList.add(a);
            }
        }
        
        int[] answer = new int[tempList.size()];
        
        for(int i=0; i<tempList.size(); i++){
            answer[i] = tempList.get(i);
        }
        
        return answer;
    }
}