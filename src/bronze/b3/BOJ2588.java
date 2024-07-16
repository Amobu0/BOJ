package bronze.b3;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int numThree = second % 10;
        int numFour = (second / 10) % 10;
        int numFive = second /100;

        System.out.println(first * numThree);
        System.out.println(first * numFour);
        System.out.println(first * numFive);
        System.out.println(first * second);
    }
}
