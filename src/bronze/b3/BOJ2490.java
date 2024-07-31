package bronze.b3;

import java.util.Scanner;

public class BOJ2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int f = 0;
            for (int j = 0; j < 4; j++) {
                int N = sc.nextInt();
                if (N == 0) {
                    f++;
                }
            }
            if (f == 0) {
                System.out.println("E");
            } else if (f == 1) {
                System.out.println("A");
            } else if (f == 2) {
                System.out.println("B");
            } else if (f == 3) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        }
    }
}
