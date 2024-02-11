import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 0) {
            scanner.close();
            return; // 배열의 크기가 0 이하인 경우 처리를 종료
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // 배열 a를 순회하면서 최소값과 최대값을 찾음
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.printf("%d %d", min, max);

        scanner.close();
    }
}
