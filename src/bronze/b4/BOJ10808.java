package bronze.b4;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[26];
        char[] temps = sc.next().toCharArray();
        for (int i = 0; i <temps.length; i++) {
            A[temps[i] - 97]++;
        }
        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
        }
    }
}

