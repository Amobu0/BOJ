package bronze.b3;

import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = T / 300;
        int b = (T % 300) / 60;
        if (((T % 300) % 60) % 10 == 0) {
            int c = ((T % 300) % 60) / 10;
            System.out.println(a + " " + b + " " + c);
        } else {
            System.out.println(-1);
        }
    }
}
