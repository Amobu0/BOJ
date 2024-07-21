package bronze.b3;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            char first = str.charAt(i);
            char end = str.charAt((str.length() - 1) - i);
            if (first != end) {
                a++;
                break;
            }
        }
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
