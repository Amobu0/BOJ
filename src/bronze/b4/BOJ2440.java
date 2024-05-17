package bronze.b4;

import java.util.Scanner;

public class BOJ2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; N--) {
            for (int j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
