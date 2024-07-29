package bronze.b3;

import java.util.Scanner;

public class BOJ2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                num++;
                if (K == num) {
                    System.out.println(i);
                    break;
                }
            }
        }
        if (num < K) {
            System.out.println(0);
        }
    }
}
