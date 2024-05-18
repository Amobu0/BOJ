package bronze.b4;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int N = sc.nextInt();
            if (N <= 40) {
                sum += 40;
            } else {
                sum += N;
            }
        }
        System.out.println(sum/5);
    }
}
