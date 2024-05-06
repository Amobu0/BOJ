package b5;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= N; i++) {
            totalSum += i;
        }
        System.out.println(totalSum);
    }
}
