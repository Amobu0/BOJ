package bronze.b3;

import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int X = N % H;
            int Y = N / H;

            if (X == 0) {
                if (Y < 10) {
                    System.out.println(H + "0" + Y);
                } else {
                    System.out.println(H + "" + Y);
                }
            } else {
                Y++;
                if (Y < 10) {
                    System.out.println(X + "0" + Y);
                } else {
                    System.out.println(X + "" + Y);
                }
            }
        }
    }
}
