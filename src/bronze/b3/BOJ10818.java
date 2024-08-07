package bronze.b3;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }
        System.out.println(min + " " + max);
    }
}
