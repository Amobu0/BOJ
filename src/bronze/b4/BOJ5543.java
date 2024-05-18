package bronze.b4;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int min = Math.min(A, Math.min(B, C));
        int min2 = Math.min(D, E);
        System.out.println((min + min2) - 50);
    }
}
