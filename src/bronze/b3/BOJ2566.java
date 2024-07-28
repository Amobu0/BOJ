package bronze.b3;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int l = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int N = sc.nextInt();
                if (N >= max) {
                    max = N;
                    c = i + 1;
                    l = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(c + " " + l);
    }
}
