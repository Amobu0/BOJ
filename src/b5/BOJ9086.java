package b5;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String text = sc.nextLine();
            String first = text.substring(0, 1);
            String last = text.substring(text.length()-1);
            System.out.println(first+last);
        }
    }
}
