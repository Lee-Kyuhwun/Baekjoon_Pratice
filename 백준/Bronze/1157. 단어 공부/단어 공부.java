import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String S = in.nextLine();
        /*
        * 각 문자들의 빈도수를 나타내기 위한 배열을 선언하고 문자열 s를 받는다.
        * 배열의 0번째 원소는 A를 의미한다.
        * 만약 입력받은 문장에서 A가 3번 나오면 arr[0] = 3인것이다.
        * */
        int[] arr= new int[26];


        /*
        * 입력받은 문자열에 대해서 첫문자부터 마지막 문자까지 검사하기위한 반복문
        * */
        for(int i=0; i<S.length();i++){
            if ('A' <= S.charAt(i) && S.charAt(i) <= 'Z') { // 대문자 범위
                arr[S.charAt(i) - 'A']++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위 여기서 문자열은 대문자 아니면 무조건 소문자이니 이런식으로 처리하면된다.
                arr[S.charAt(i) - 'a']++;
            }
        }
        /*
        * 여기서 주의해야할것은 대문자와 소문자를 둘다동일하게 처리해줘야한다는 것이다.
        * a나A나 모두 1씩 증가시켜야한다는 것이다.
        * 이는 아스키코드를 이용하면된다.
        * */
        /*
        * 여기서 charAt에 대해서 알아보면 string타입으로 받은 문자열을 char타입으로 한 글자만 받는 함수이다.
        * String str = "Hello World";
        * System.out.print(str.charAt(0));
        * 이럴 경우는 H만 나온다.
        * 이와 같은 예제로 어떤 느낌인지 알것이다.
        * 위에서는 문자열의 한글자씩 비교하는 용도로 사용된다.
        * */


        // 이제 최댓값과 만약 동일한 경우 출력할 ?를 만든다.
        int max= -1;
        char ch = '?';

        for(int i=0; i<26;i++){
            if(arr[i]>max){ //만약 더 크면
                max= arr[i]; // max를 교체해준다.
                ch = (char)(i+65); //문자로 치환하기위해 캐스팅을 해준다. 
            }
            else if(arr[i] ==max){
                ch = '?';// 만약 둘이 같다면 최대인 문자가 2개 이상이라는 뜻이므로 ?를 대입한다.
            }
        }

        System.out.println(ch);
        in.close();
    }
}
