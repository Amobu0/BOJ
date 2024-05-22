package bronze.b1;

import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] badScore = new int[N];
        int maxNum = 0;

        for (int i = 0; i < N; i++) {
            badScore[i] = sc.nextInt();
            if (maxNum <= badScore[i]) {
                maxNum = badScore[i];
            }
        }
        float sum = 0;
        for (int i : badScore) {
            sum += (float) i / maxNum * 100L;
        }
        System.out.println(sum/N);
    }
}
