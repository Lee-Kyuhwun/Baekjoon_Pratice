class Solution {
    public int solution(int a, int d, boolean[] included) {
        int count = 0;
        for (int i = 0; i < included.length; i++) {
            int term = a + (i * d);
            if (included[i]) {
                count += term;
            }
        }
        return count;
    }
}