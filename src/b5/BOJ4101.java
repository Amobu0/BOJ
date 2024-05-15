package b5;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            if (A == 0 || B == 0) {
                break;
            } else if (A > B) {
                System.out.println("Yes");
            } else if (A <= B) {
                System.out.println("No");
            }
        }
    }
}
