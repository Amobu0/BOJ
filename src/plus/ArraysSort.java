package plus;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysSort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] x = {a, b, c}; // int

        Arrays.sort(x); // 오름차순 정렬

        System.out.println(x[0] + " " + x[1] + " " + x[2]);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        Integer[] X = {A, B, C}; // Integer

        Arrays.sort(X, Collections.reverseOrder()); // 내림차순 정렬

        System.out.println(X[0] + " " + X[1] + " " + X[2]);
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

