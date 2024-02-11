import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String name = scanner.next();
            int age = scanner.nextInt();
            int weight = scanner.nextInt();

            // 입력의 마지막을 체크
            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            // 회원 분류 조건 체크
            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }

        scanner.close();

    }
}
