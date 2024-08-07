package bronze.b3;

import java.util.Scanner;

public class BOJ2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if (i >= j || i + j >= 2 * N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = N; i < 2 * N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if (i < j || i + j < 2 * N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
