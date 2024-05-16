package bronze.b4;

import java.util.Scanner;

public class BOJ2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        for (int i = 1; l >= i; l--) {
            System.out.println(l);
        }
    }
}
