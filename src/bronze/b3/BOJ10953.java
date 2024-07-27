package bronze.b3;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String[] B = sc.nextLine().split(",");
            int a = Integer.parseInt(B[0]);
            int b = Integer.parseInt(B[1]);
            System.out.println(a+b);
        }
    }
}
