import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 오른쪽 벽에 치우친 별찍기
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j<n-i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


        scanner.close();

    }
}
