package bronze.b5;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();

        char[] chars = Word.toCharArray();
        for (char temp : chars) {
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char) (temp - 32));
            } else {
                System.out.print((char) (temp + 32));
            }
        }
    }
}

