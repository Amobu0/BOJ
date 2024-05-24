package bronze.b4;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int sum = a + b + c + d;
        if (sum < 60) {
            System.out.println(sum);
        } else {
            System.out.println(sum / 60);
            System.out.println(sum % 60);
        }
    }
}
