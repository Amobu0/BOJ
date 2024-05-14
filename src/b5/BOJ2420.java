package b5;

import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long M = sc.nextInt();
        long N = sc.nextInt();
        if (M - N >= 0) {
            System.out.println(M - N);
        } else {
            System.out.println(-(M - N));
        }
    }
}
