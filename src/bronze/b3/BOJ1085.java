package bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = arr[2] - arr[0];
        arr[5] = arr[3] - arr[1];

        Arrays.sort(arr);
        System.out.println(arr[0]);

    }
}
