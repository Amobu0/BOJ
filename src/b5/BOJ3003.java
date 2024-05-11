package b5;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = {1, 1, 2, 2, 2, 8};

        for (int i : A) {
            System.out.print(i - sc.nextInt()+" ");
        }
        System.out.println();
    }
}
