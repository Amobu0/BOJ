package bronze.b3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                int[] arr = new int[3];
                arr[0] = x * x;
                arr[1] = y * y;
                arr[2] = z * z;

                Arrays.sort(arr);
                if (arr[2] == arr[0] + arr[1]) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
