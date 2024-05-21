package bronze.b4;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A*B;

        if (sum > C) {
            System.out.println(sum - C);
        } else {
            System.out.println(0);
        }
    }
}
