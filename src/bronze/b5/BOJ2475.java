package bronze.b5;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            int N2 = N * N;
            sum += N2;
        }
        System.out.println(sum%10);
    }
}
