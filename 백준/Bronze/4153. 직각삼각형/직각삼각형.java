import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[3];

        while(true){
            for(int i=0 ; i<3; i++){
                arr[i] = scanner.nextInt();
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                scanner.close();
                return;
            }
            int max = Arrays.stream(arr).max().getAsInt();
            int sum =0;
            for(int i=0 ; i<3; i++) {
                if(arr[i] != max){
                    sum += arr[i] * arr[i];
                }
            }
            if(sum == (max*max)){
                System.out.println("right");
            }
            else{
                System.out.println("wrong");
            }


        }
    }
}
