import java.util.Scanner;



public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[num];
        for(int i=0 ;i<num ; i++){
            arr[i] = sc.nextInt();
        }
        double sum =0;
        double max = arr[0];
        for(int i=0; i< num; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i=0 ;i <num; i++){
            sum += ((double) arr[i]*100)/max;
        }
        System.out.println(sum/num);
    }
}