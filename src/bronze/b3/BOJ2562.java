package bronze.b3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int index =0;
        for (int i = 1; i < 10; i++) {
            int N = sc.nextInt();
            if (max < N) {
                index = i;
                max = N;
            }
        }
            System.out.println(max);
            System.out.println(index);
    }
}
