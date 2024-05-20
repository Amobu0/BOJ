package bronze.b4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] num = {a, b, c};

        Arrays.sort(num);
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
//
//        int max = Math.max(a, Math.max(b, c));
//        int min = Math.min(a, Math.min(b, c));
//
//        for (int i : num) {
//            if (i != max) {
//                if (i != min) {
//                    System.out.println(min + " " + i + " " + max);
//                }
//            }
//        }
    }
}

