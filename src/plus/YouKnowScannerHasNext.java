package plus;

import java.util.Scanner;

/**
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 프로그램이 언제 종료되는지 조건을 알려주지 않는다.
 * 너 scanner 종료조건 아니?? 어떻게 줄 수 있는지 물어보는 문제
 * boolean hasNext() 다음에 받을게 있냐 있으면 실행 true 없으면 false 종료
 */


public class YouKnowScannerHasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i + j);
        }
    }
}
