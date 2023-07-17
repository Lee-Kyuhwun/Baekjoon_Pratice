import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String numbers = sc.nextLine();
        int[] arr = new int[num];
        for(int i=0; i< num; i++){
            arr[i] = Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        int sum =0;
        for(int i=0; i< num; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}