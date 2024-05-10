package b5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            list.add(M);
        }
        int V = sc.nextInt();
        int count = 0;
        for (Integer integer : list) {
            if (integer == V) {
                count++;
            }
                continue;
        }
        System.out.println(count);
        
    }
}
