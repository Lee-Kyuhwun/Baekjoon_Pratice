        class Solution {
            public int[] solution(int[] arr, int[][] queries) {
                int[] answer = {};
                for(int a[] : queries){
                    int divide = a[2];
                    int start = a[0];
                    int end = a[1];
                    for(int i = start; i<= end ; i++){
                        if(i % divide == 0){
                            arr[i] += 1;
                        }
                    }
                }
                return arr;
            }
        }