import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("#")) break; // 입력의 끝을 체크

            int vowelCount = countVowels(line);
            System.out.println(vowelCount);
        }

        scanner.close();
    }

    private static int countVowels(String line) {
        int count = 0;
        String vowels = "aeiouAEIOU"; // 모음 리스트

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (vowels.indexOf(ch) != -1) { // 현재 문자가 모음 리스트에 포함되어 있는지 확인
                count++;
            }
        }

        return count;
    }
}
